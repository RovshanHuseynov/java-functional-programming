package lesson12.findfirst;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().findFirst().ifPresent(System.out::println);
        list.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
