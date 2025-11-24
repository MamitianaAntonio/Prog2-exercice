import java.time.LocalDateTime;

public record HistoriqueNote(
    double valeur, LocalDateTime dateExamen, String motif
) {}