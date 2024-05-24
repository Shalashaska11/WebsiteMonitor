import java.util.List;

public class User {
    private String userID;
    private String email;
    private List<Subscribtion> subscribtionsList;

    public void addSubscribtion(Subscribtion subscribtion){
        subscribtionsList.add(subscribtion);
    }
    public void deleteSubscribtion(Subscribtion subscribtion){
        subscribtionsList.remove(subscribtion);
    }
    public String getUserID() {
        return userID;
    }
    public String getEmail(){
        return email;
    }
    public User(String UserId, String email, List<Subscribtion> subscribtionsList){
        this.userID = getUserID();
        this.email = getUserID();
        this.subscribtionsList = subscribtionsList;
    }
}
