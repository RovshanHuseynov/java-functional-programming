package lesson13.intstream;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("-------------------------------");

        IntStream.range(1,10)
                .parallel()
                .forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("-------------------------------");

        IntStream.rangeClosed(1,10)
                .forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("-------------------------------");

        IntStream.rangeClosed(1,100)
                .filter(i -> i%2==0 && i>85)
                .forEach(i -> System.out.print(i + ","));
        System.out.println();
        System.out.println("-------------------------------");

        long count = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0 && i > 85)
                .count();
        System.out.println("count: " + count);
        System.out.println("-------------------------------");

        long count1 = IntStream.rangeClosed(100, 200)
                .filter(i -> i % 11 == 0)
                .count();
        System.out.println("count1: " + count1);
        System.out.println("-------------------------------");
    }
}
