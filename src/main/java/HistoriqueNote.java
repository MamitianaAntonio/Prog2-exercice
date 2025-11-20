import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class HistoriqueNote {
  private final LocalDateTime dateDeModification = LocalDateTime.now();
  private double nouvelleValeur;
  private String motif;
}
