import java.time.LocalDate;

public class Tuteur extends Personne {
  private String lienEtudiant;

  public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numeroTel, String lienEtudiant) {
    super(id, nom, prenom, dateNaissance, email, numeroTel);
    this.lienEtudiant = lienEtudiant;
  }
}