package lesson9.mapandflatmap;

import java.util.List;

public class Customer {
    private final int id;
    private final String name;
    private final String email;
    private final List<String> phoneNumbers;

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
