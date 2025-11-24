import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

@DisplayName("Tests de NoteService - Évaluation PROG2 2025-2026")
public class NoteServiceTest {

  private static NoteService noteService;
  private static Etudiant antonio;
  private static Cours prog2;
  private static Examen examen1, examen2;
  private static LocalDateTime avantCorrection;
  private static LocalDateTime apresCorrection;

  @BeforeAll
  public static void setUp() {
    var enseignant = new Enseignant(
        1,
        "Tokimahery",
        "Dr", null,
        "tokimahery@gmail.com",
        null,
        "backend"
    );

    prog2 = new Cours(1, "PROG2", 6, enseignant);

    examen1 = new Examen(
        1,
        "Examen1", prog2,
        LocalDateTime.of(2025, 10, 20, 10, 0),
        2
    );

    examen2 = new Examen(2, "Examen2", prog2,
        LocalDateTime.of(2025, 11, 15, 14, 0), 2);

    var tuteur = new Tuteur(1,
        "Passerelles",
        "Numeriques",
        null,
        "passerellesnumriques.org",
        null,
        "Étudiant lié à l'organisation"
    );

    antonio = new Etudiant(
        1, "RATOLOJANAHARY",
        "Mamitiana Antonio",
        LocalDateTime.of(2005, 6, 25, 0, 0).toLocalDate(),
        "hei.antonio.10@gmail.com",
        "0381048834",
        "K2", tuteur
    );

    Note noteExamen1 = new Note(antonio, examen1, 10.0, "Note initiale");
    Note noteExamen2 = new Note(antonio, examen2, 15.0, "Note finale");

    noteExamen1.modifierNote(14.0, "Bonus de cours");

    avantCorrection = LocalDateTime.now().minusDays(10);
    apresCorrection = LocalDateTime.now();

    noteService = new NoteService(List.of(noteExamen1, noteExamen2));
  }

  @Test
  void getExamGrades_avant_correction_donne_premiere_note_du_cours() {
    double note = noteService.getExamGrades(prog2, antonio, avantCorrection);
    Assertions.assertEquals(10.0, note, 0.01);
  }

  @Test
  void getExamGrades_apres_correction_donne_14() {
    double note = noteService.getExamGrades(prog2, antonio, apresCorrection);
    Assertions.assertEquals(14.0, note, 0.01);
  }

  @Test
  void getCourseGrades_avant_correction_donne_moyenne_12_5() {
    double note = noteService.getCourseGrades(prog2, antonio, avantCorrection);
    Assertions.assertEquals(12.5, note, 0.01);
  }

  @Test
  public void getCourseGrades_apres_correction_donne_moyenne_14_5() {
    double note = noteService.getCourseGrades(prog2, antonio, apresCorrection);
    Assertions.assertEquals(14.5, note, 0.01);
  }

  @Test
  public void etudiant_inconnu_retourne_0() {
    Etudiant inconnu = new Etudiant(2,
        "XXX",
        "YYY",
        null,
        "x@x.x",
        "000",
        "X",
        null
    );
    double note = noteService.getCourseGrades(prog2, inconnu, LocalDateTime.now());
    Assertions.assertEquals(0.0, note, 0.01);
  }
}