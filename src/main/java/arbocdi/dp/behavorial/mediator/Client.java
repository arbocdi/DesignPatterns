package arbocdi.dp.behavorial.mediator;

public class Client {
    public static void main(String[] args) {
        User arboc = new User("Arboc");
        User dhurva = new User("Dhurva");
        User maya = new User("Maya");
        Chat chat = new Chat()
                .addUser(arboc)
                .addUser(dhurva)
                .addUser(maya);
        arboc.sendMessage("Every1 get ready!");
        dhurva.sendMessage("Im ready!");
        maya.sendMessage("Im not!");
    }
}
