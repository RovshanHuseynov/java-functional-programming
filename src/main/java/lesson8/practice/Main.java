package lesson8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        // 2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print);
        System.out.println();

        // 3. Integer Stream with sum
        int sum = IntStream
                .range(1, 5)
                .sum();
        System.out.println(sum);

        // 4. Stream.of, sorted, findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)
                .sorted()
                .filter(s -> s.contains("A"))
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // 6. average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(value -> value * value)
                .average()
                .ifPresent(System.out::println);

        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah");
        people.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

    }
}
