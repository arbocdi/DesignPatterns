package arbocdi.dp.behavorial.observer;

public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(" User " + name + " got message: " + msg);
    }
}
