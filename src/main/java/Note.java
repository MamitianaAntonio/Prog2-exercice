import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Note {
  private  Etudiant etudiant;
  private Examen examen;
  private final List<HistoriqueNote> historiqueNotes = new ArrayList<>();

  public Note(Etudiant etudiant, Examen examen, double valeurInitiale, String motifInitiale) {
    this.etudiant = etudiant;
    this.examen = examen;
    historiqueNotes.add(new HistoriqueNote(valeurInitiale, LocalDateTime.now(), motifInitiale));
  }

  public void modifierNote (double nouvelleValeur, String motif) {
    historiqueNotes.add(new HistoriqueNote(nouvelleValeur, LocalDateTime.now(), motif));
  }

  public double valeurTemps(LocalDateTime instant) {
    return historiqueNotes.stream()
        .filter(heure -> !heure.dateExamen().isAfter(instant))
        .reduce((premier, deuxieme) -> deuxieme)
        .map(HistoriqueNote::valeur)
        .orElse(0.0);
  }
}
