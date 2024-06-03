import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Website {
    private URI uri;
    private LocalDateTime lastChecked;
    private String websiteContent;
    private boolean update;

    public Website(URI uri){
        this.uri = uri;
        checkForUpdates();
    }
    public void checkForUpdates(){
        StringBuilder newWebsiteContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(uri.toURL().openStream(), StandardCharsets.UTF_8))){
                for (String line; (line = reader.readLine()) != null; ) {
                    newWebsiteContent.append(line);
                }
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        lastChecked = LocalDateTime.now();

        if (!websiteContent.toString().equals(websiteContent)) update = true;
        websiteContent = newWebsiteContent.toString();

    }
}
