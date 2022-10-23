package lesson0.hashCode;

import java.util.Objects;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if(!(o instanceof Employee)) return false;

        Employee that = (Employee) o;

        return this.age == that.age &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + age;
        return result;
    }
}
