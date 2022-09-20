package lesson10;

import java.util.List;
import java.util.stream.Stream;

public class mapandflatmap {
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
    }
}
