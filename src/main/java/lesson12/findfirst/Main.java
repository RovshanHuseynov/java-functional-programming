package lesson12.findfirst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().findFirst().ifPresent(System.out::println);
        System.out.println("-------------------------------");
        list.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("-------------------------------");

        // findAny is very similar to findFirst,
        // so why we need findAny if we already have findFirst ?
        // findAny helps performance when it comes to
        // parallel processing of streams

        List<Integer>list2 = Arrays.asList(15,3,5,1,7,8,9,11,12,13,23,26);
        list2.parallelStream()
                .filter(i -> i%2==0)
                .findAny()
                .ifPresent(System.out::println);
        System.out.println("-------------------------------");
    }
}
