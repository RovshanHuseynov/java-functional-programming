package lesson10.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    // source: https://www.youtube.com/watch?v=CwvlS3ViGFQ
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c", "d", "e");
        list1.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();
        System.out.println("--------------------------------");

        List<List<String>> list2 = Arrays.asList(
                Arrays.asList("a1", "a2"),
                Arrays.asList("b1", "b2"),
                Arrays.asList("c1", "c2"),
                Arrays.asList("d1", "d2")
        );
        list2.stream()
                .flatMap(list -> list.stream())
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();
        System.out.println("--------------------------------");

        List<Integer> list3 = Arrays.asList(6,8,10,12,12,20);
        list3.stream()
                .flatMap(i -> Stream.of(i,i/2,i/2+1))
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();
        System.out.println("--------------------------------");
    }
}
