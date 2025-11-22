import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Singular;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public class Promotion {
  private int id;
  private String nomPromotion;

  @Singular
  private Set<String> groupes = new HashSet<>();
}
