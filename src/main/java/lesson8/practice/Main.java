package lesson8.practice;

import java.util.stream.IntStream;

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
    }
}
