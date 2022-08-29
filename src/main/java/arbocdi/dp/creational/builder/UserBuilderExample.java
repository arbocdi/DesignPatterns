package arbocdi.dp.creational.builder;

public class UserBuilderExample {
    public static void main(String[] args) {
        User user = new UserBuilder("arboc","di").setAge(16).build();
        System.out.println(user);
    }
}
