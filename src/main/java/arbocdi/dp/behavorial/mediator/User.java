package arbocdi.dp.behavorial.mediator;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter
    private String name;
    @Setter
    private Chat chat;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(String.format("User %s received message %s", name, message));
    }
}
