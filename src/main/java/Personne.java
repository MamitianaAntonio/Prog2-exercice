import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Personne {
  private int id;
  private String nom;
  private String prenom;
  private String dateNaissance;
  private String email;
  private String numeroTel;
}
