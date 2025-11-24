import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Personne {
  private int id;
  private String nom;
  private String prenom;
  private LocalDate dateNaissance;
  private String email;
  private String numeroTel;
}
