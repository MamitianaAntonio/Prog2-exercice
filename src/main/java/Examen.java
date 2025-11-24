import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Examen {
  private int id;
  private String titre;
  private Cours cours;
  private LocalDateTime dateExamen;
  private int coefficient;
}
