import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String email;
    private List<Subscription> SubscriptionList = new ArrayList<>();

    public void addSubscribtion(Subscription subscription){
        SubscriptionList.add(subscription);
    }
    public void deleteSubscribtion(Subscription subscription){
        SubscriptionList.remove(subscription);
    }
    public String getUserID() {
        return userID;
    }
    public String getEmail(){
        return email;
    }
    public User(String UserId, String email, List<Subscription> SubscriptionList){
        this.userID = getUserID();
        this.email = getUserID();
        this.SubscriptionList = SubscriptionList;
    }
}
