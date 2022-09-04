package lesson4.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _Steams2 {
    // source: https://www.youtube.com/watch?v=f5j1TaJlc0w
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
                .filter(person -> person.getAge() <= 18)   // intermediate operator
                .collect(Collectors.toList());             // terminal operator

        System.out.println(youngPeople);

        List<String> names = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());

        names.stream().forEach(System.out::println);

        Optional<String> firstName = people.stream()
                .map(person -> person.getName())
                .findFirst();

        System.out.println(firstName);
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
