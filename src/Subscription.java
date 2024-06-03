import java.time.LocalDateTime;

public class Subscription {
    private String subscriptionID;
    private int frequency;
    private String url;
    private String channel;
    private LocalDateTime lastChecked;

    public void setLastChecked(LocalDateTime lastChecked) {
        this.lastChecked = lastChecked;
    }
}
