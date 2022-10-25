package lesson100.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    // find frequency of each character in a given String
    public static void main(String[] args) {
        System.out.print("type a string: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Map<String, Long> countMap = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);

        List<String> letters = Arrays.asList("A", "B", "C", "D");
        List<String> permutations =
                letters.stream().flatMap(l1 ->
                        letters.stream()
                                .filter(l2 -> !l1.equals(l2))
                                .map(l2 -> l1 + l2)
                ).collect(Collectors.toList());

        System.out.println(permutations);

        List<Integer> digits = Arrays.asList(1, 2, 3, 4);
        digits.forEach(i -> digits.forEach(j -> System.out.println(i + "-" + j)));

        List<String> list = digits.stream()
                .flatMap(i -> digits.stream().map(j -> i + "-" + j))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}