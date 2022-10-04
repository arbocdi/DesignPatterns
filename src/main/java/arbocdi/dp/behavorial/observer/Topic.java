package arbocdi.dp.behavorial.observer;

import java.util.LinkedList;
import java.util.List;

public class Topic {

    private List<User> users = new LinkedList<>();

    public void attach(User user){
        users.add(user);
    }
    public void detach(User user){
        users.remove(user);
    }
    public void sendMessage(String msg){
        users.forEach(user -> user.update(msg));
    }
}
