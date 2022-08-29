package arbocdi.dp.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String phone;
    private final String address;

    public User(UserBuilder builder) {
        firstName = builder.getFirstName();
        lastName = builder.getLastName();
        age = builder.getAge();
        phone = builder.getPhone();
        address = builder.getAddress();
    }
}
