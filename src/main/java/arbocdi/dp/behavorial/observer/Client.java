package arbocdi.dp.behavorial.observer;

public class Client {
    public static void main(String[] args) {
        User dh = new User("Dhurva");
        User ar = new User("Arboc");
        Topic topic = new Topic();
        topic.attach(dh);
        topic.attach(ar);

        topic.sendMessage(" Eve server is starting...");

        topic.detach(ar);

        topic.sendMessage("U can log in now!");

    }
}
