import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Set;

@Getter
@AllArgsConstructor
public class Cours {
  @NonNull private int id;
  @NonNull private String label;
  private int credits;
  private Set<Enseignant> enseignant;
}