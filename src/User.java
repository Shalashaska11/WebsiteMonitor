import Comparison.ComparisonStrategy;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private ComparisonStrategy strategy;
    private List<WebsiteSubscription> subscriptionList = new ArrayList<>();


    public void addSubscriptions(WebsiteSubscription subscription){
        subscriptionList.add(subscription);
    }


    public List<WebsiteSubscription> getSubscriptionList() {
        return subscriptionList;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public ComparisonStrategy getStrategy() { return strategy; }
    public User(String name, String email, ComparisonStrategy strategy) {
        this.name = name;
        this.email = email;
        this.strategy = strategy;
    }


}