package lesson4.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static lesson4.streams._Streams3.Gender.*;

public class _Streams3 {
    // source: https://www.youtube.com/watch?v=Q93JsQ8vcwY
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 20, MALE),
                new Person("Maria", 14, FEMALE),
                new Person("Aisha", 23, FEMALE),
                new Person("Alex",18, MALE),
                new Person("Alice", 10, FEMALE),
                new Person("Simon", 17, MALE)
        );

        System.out.println("declarative approach -----------------");
        people.stream()
                .forEach(System.out::println);

        // filter
        System.out.println("filter --------------------------");
        List<Person> females = people.stream()
                .filter(person -> person.gender.equals(FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        // sort
        System.out.println("sort --------------------------");
        Stream<Person> sorted = people.stream()
                .sorted((o1, o2) -> o1.age - o2.age);
        sorted.forEach(System.out::println);

        // all match
        System.out.println("all match --------------------------");

        // any match
        // none match
        // max
        // min
        // group
    }

    static class Person {
        private final String name;
        private final int age;
        private final Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
