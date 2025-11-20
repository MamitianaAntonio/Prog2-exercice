import java.time.LocalDate;

public class Etudiant extends Personne{
  private String groupe;
  private Tuteur tuteur;

  public Etudiant(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numeroTel, String groupe, Tuteur tuteur) {
    super(id, nom, prenom, dateNaissance, email, numeroTel);
    this.groupe = groupe;
    this.tuteur = tuteur;
  }
}