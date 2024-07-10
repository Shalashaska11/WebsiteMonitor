package Test;

import System.Website;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WebsiteTest{

    private static Website website;

    @BeforeAll
    public static void setUp() {
        website = new Website("https://github.com");
    }

    @Test
    public void testDownloadContent(){

    }
}