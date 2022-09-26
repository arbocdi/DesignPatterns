package arbocdi.dp.behavorial.mediator;

import java.util.LinkedList;
import java.util.List;

public class Chat {
    private List<User> users = new LinkedList<>();

    protected void sendMessage(String message, User sender) {
        System.out.println(String.format("====User %s sends message %s====", sender.getName(), message));
        users.stream()
                .filter(user -> user != sender)
                .forEach(user -> user.receiveMessage(message));
    }

    public Chat addUser(User user) {
        users.add(user);
        user.setChat(this);
        return this;
    }
}
