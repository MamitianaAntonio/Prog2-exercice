import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cours {
  private int id;
  private String label;
  private int credits;
  private Enseignant enseignant;
}