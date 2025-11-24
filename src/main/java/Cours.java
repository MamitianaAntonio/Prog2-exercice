import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Cours {
  private int id;
  private String label;
  private int credits;
  private Enseignant enseignant;
}