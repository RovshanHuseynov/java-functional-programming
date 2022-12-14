package lesson4.streams;

import java.util.List;
import java.util.stream.Collectors;

import static lesson4.streams._Streams.Gender.FEMALE;
import static lesson4.streams._Streams.Gender.MALE;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Lucas", MALE),
                new Person("Alice", FEMALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("----------------");
        people.stream()
                .map(person -> person.name.length())
                .forEach(System.out::println);

        boolean allFemale = people.stream().allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(allFemale);

        boolean containsFemale = people.stream().anyMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsFemale);

        boolean containsMale = people.stream().anyMatch(person -> person.gender.equals(MALE));
        System.out.println(containsMale);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
