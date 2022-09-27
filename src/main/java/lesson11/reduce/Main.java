package lesson11.reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // initial value is zero
        list.stream()
                .reduce((sum, i) -> sum + i)
                .ifPresent(System.out::println);
        System.out.println("--------------------------");

        // sum with given initial value
        Integer result = list.stream()
                .reduce(100, (sum, i) -> sum + i);
        System.out.println("result: " + result);
        System.out.println("--------------------------");

        // sum with given initial value with using curly braces
        Integer result1 = list.stream()
                .reduce(100, (sum, i) -> {
                    System.out.print((sum+i) + ", ");
                    return sum + i;
                });
        System.out.println();
        System.out.println("result1: " + result1);
        System.out.println("--------------------------");

        list.stream()
                .max(Comparator.comparingInt(i -> i))
                .ifPresent(System.out::println);
        System.out.println("--------------------------");

        list.stream()
                .min(Comparator.comparing(i -> i))
                .ifPresent(System.out::println);
        System.out.println("--------------------------");
    }
}
