package arbocdi.dp.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class UserBuilder {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String phone;
    private String address;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User build(){
        return new User(this);
    }
    protected void checkUser(){
        if (firstName==null||lastName==null){
            throw new RuntimeException(" firstName and lastName are mandatory!");
        }
    }
}
