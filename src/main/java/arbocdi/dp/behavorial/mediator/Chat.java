package arbocdi.dp.behavorial.mediator;

import java.util.LinkedList;
import java.util.List;

public class Chat {
    private List<User> users = new LinkedList<>();

    public void sendMessage(String message){
        users.stream()
                .forEach(user -> user.receiveMessage(message));
    }

    public Chat addUser(User user){
        users.add(user);
        return this;
    }
}
