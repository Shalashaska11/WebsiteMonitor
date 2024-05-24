import java.time.LocalDate;
import java.time.LocalDateTime;

public class Subscribtion {
    private String subscribtionID;
    private int frequency;
    private String url;
    private String channel;
    private LocalDateTime lastChecked;

    public void setLastChecked(LocalDateTime lastChecked) {
        this.lastChecked = lastChecked;
    }
}
