package lesson100.practise;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    // find frequency of each character in a given String
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Map<String, Long> countMap = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }
}