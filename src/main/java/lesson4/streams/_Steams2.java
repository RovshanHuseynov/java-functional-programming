package lesson4.streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Steams2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 10),
                new Person("Maria", 14),
                new Person("Aisha", 17),
                new Person("Alex",18),
                new Person("Alice", 20),
                new Person("Simon", 23)
        );

        List<Person> youngPeople = people.stream()
                .filter(person -> person.getAge() <= 18)
                .collect(Collectors.toList());

        System.out.println(youngPeople);
    }

    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


    }
}
