package arbocdi.dp.behavorial.mediator;

import lombok.Getter;

public class User {
    @Getter
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println(String.format("User %s received message %s", name, message));
    }
}
