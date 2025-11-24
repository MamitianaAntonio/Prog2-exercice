import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString(callSuper = true)
public class Tuteur extends Personne {
  private String lienEtudiant;

  public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance, String email, String numeroTel, String lienEtudiant) {
    super(id, nom, prenom, dateNaissance, email, numeroTel);
    this.lienEtudiant = lienEtudiant;
  }
}