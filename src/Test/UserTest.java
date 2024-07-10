package Test;

import Comparison.ContentSizeComparisonStrategy;
import Comparison.HTMLComparisonStrategy;
import Comparison.TextContentComparisonStrategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import System.User;
import System.WebsiteSubscription;
import Comparison.ComparisonStrategy;
import static org.junit.jupiter.api.Assertions.*;
import System.Website;

import java.util.List;

class UserTest {

    private static User TestUser1;
    private static ComparisonStrategy Strategy;

    private static Website Website1;
    private static Website Website2;

    @BeforeAll
    public static void setup(){
        Strategy = new HTMLComparisonStrategy();
        TestUser1 = new User("Eins Test", "eins.test@example.com", Strategy);

        Website1 = new Website("https://github.com/");
        Website2 = new Website("https://wttr.in/");
    }

    @Test
    public void testConstructor() {
        assertEquals("Eins Test", TestUser1.getName());
        assertEquals("eins.test@example.com", TestUser1.getEmail());
        assertEquals(Strategy, TestUser1.getStrategy());
        assertTrue(TestUser1.getSubscriptionList().isEmpty());
    }

    @Test
    void testAddDeleteSubscriptions() {
        WebsiteSubscription subscription1 = new WebsiteSubscription(Website1);
        WebsiteSubscription subscription2 = new WebsiteSubscription(Website2);

        TestUser1.addSubscriptions(subscription1);
        TestUser1.addSubscriptions(subscription2);

        List<WebsiteSubscription> subscriptionsList = TestUser1.getSubscriptionList();

        assertEquals(2, subscriptionsList.size());
        assertTrue(subscriptionsList.contains(subscription1));
        assertTrue(subscriptionsList.contains(subscription2));

        TestUser1.deleteSubscriptions(subscription1);
        TestUser1.deleteSubscriptions(subscription2);
        assertEquals(0, subscriptionsList.size());
    }
}