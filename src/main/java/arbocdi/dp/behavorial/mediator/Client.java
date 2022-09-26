package arbocdi.dp.behavorial.mediator;

public class Client {
    public static void main(String[] args) {
        Chat chat = new Chat()
                .addUser(new User("Arboc"))
                .addUser(new User("Dhurva"))
                .addUser(new User("Maya"));
        chat.sendMessage("Every1 undock!");
    }
}
