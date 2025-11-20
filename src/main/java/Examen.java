import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Examen {
  private int id;
  private String titre;
  private Cours cours;
  private LocalDateTime dateExamen;
  private int coefficient;
}
