import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Cour {
  @NonNull private final int id;
  @NonNull private final String label;
  private int credits;
  private Enseignant enseignant;
}
