package lesson4.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static lesson4.streams._Streams3.Gender.FEMALE;
import static lesson4.streams._Streams3.Gender.MALE;

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
        boolean allMatch = people.stream()
                .allMatch(person -> person.age > 10);
        System.out.println(allMatch);

        // any match
        System.out.println("any match --------------------------");
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.age > 100);
        System.out.println(anyMatch);

        // none match
        System.out.println("none match --------------------------");
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.name.equals("Antonio"));
        System.out.println(noneMatch);

        // max
        System.out.println("max ---------------------------------");
        people.stream()
                .max(((o1, o2) -> o1.age - o2.age))
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("no max found"));

        // min
        System.out.println("min ---------------------------------");
        people.stream()
                .min(((o1, o2) -> o1.age - o2.age))
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("no min found"));

        // group
        System.out.println("group ---------------------------------");
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(person -> person.gender));

        groupByGender.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        }));
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
