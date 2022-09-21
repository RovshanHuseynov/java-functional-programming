package lesson11.reduce;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .reduce((sum, i) -> sum + i)
                .ifPresent(System.out::println);
        System.out.println("--------------------------");

        // sum with given initial value
        Integer result = list.stream()
                .reduce(100, (sum, i) -> {
                    System.out.print((sum+i) + ", ");
                    return sum + i;
                });
        System.out.println();
        System.out.println("result: " + result);
    }
}
