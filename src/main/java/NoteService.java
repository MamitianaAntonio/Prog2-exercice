import java.time.LocalDateTime;
import java.util.List;

public class NoteService {
  private List<Note> notes;

  public NoteService() {
    this.notes = List.copyOf(notes);
  }

  public double getExamGrades (Cours cours, Etudiant etudiant, LocalDateTime t) {
    return notes.stream()
        .filter(note -> note.getExamen().getCours().equals(cours) && note.getEtudiant().equals(etudiant))
        .findFirst()
        .map(note -> note.valeurTemps(t))
        .orElse(0.0);
  }
}
