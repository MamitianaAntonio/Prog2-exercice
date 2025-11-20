import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Etudiants {
  private String id;
  private String nom;
  private String prenom;
  private LocalDate dateNaissance;
  private String email;
  private String numeroTelephone;
  private Tuteur tuteur;
}