package lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mapandflatmap {
    // source: https://www.youtube.com/watch?v=sVX421gaRT4
    public static void main(String[] args) {
        List<Integer> list = List.of(2,10,15,1,9);

        list.stream()
                .map(i -> i*10)
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("--------------------------");

        list.stream()
                .flatMap(i -> Stream.of(i+10, i+20))
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("----------------------------");

        int[] arr1 = new int[] {1,2,3,4};
        int[] arr2 = new int[] {10,20,30,40};

        Stream.of(arr1, arr2)
                .flatMapToInt(i -> IntStream.of(i))
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("----------------------------");

        Stream.of(arr1, arr2)
                .flatMapToInt(IntStream::of)
                .max()
                .ifPresent(System.out::println);
        System.out.println("----------------------------");

        List<List<String>> names = Arrays.asList(
                Arrays.asList("Kamil", "Amal", "Celal", "Eli", "Sadiq", "Kazim"),
                Arrays.asList("Celalleddin", "Sadeqeddin", "Imameddin", "Delaleddin"));

        names.stream()
                .flatMap(listOfStr -> listOfStr.stream().map(str -> str.length()))
                .distinct()
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("----------------------------");
    }
}
