import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public class NoteService {
  private final List<Note> notes;

  public NoteService() {
    this.notes = List.of();
  }

  public double getExamGrades(Cours cours, Etudiant etudiant, LocalDateTime t) {
    return notes.stream()
        .filter(note -> note.getExamen().getCours().equals(cours)
            && note.getEtudiant().equals(etudiant))
        .findFirst()
        .map(note -> note.valeurTemps(t))
        .orElse(0.0);
  }

  public double getCourseGrades(Cours cours, Etudiant etudiant, LocalDateTime t) {
    var notesDuCours = notes.stream()
        .filter(note -> note.getExamen().getCours().equals(cours)
            && note.getEtudiant().equals(etudiant))
        .toList();

    double sommePonderee = 0.0;
    int sommeCoefficient = 0;

    for (Note note : notesDuCours) {
      double valeur = note.valeurTemps(t);
      int coef = note.getExamen().getCoefficient();
      sommePonderee += valeur * coef;
      sommeCoefficient += coef;
    }
    return sommeCoefficient == 0 ? 0.0 : sommePonderee / sommeCoefficient;
  }
}