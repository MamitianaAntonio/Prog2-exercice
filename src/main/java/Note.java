import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class Note {
  private Etudiant etudiant;
  private Examen examen;
  private double valeurInitiale;

  @Getter(AccessLevel.NONE)
  private final List<HistoriqueNote> historique = new ArrayList<>();

  public Note(Etudiant etudiant, Examen examen, double valeurInitiale) {
    this.etudiant = etudiant;
    this.examen = examen;
    this.valeurInitiale = valeurInitiale;
    this.historique.add(new HistoriqueNote(valeurInitiale, "Premier note"));
  }
}
