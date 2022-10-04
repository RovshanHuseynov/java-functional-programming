package lesson15.parallelstream;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .forEach(i -> System.out.println(Thread.currentThread().getName()+ ": " + i));
        System.out.println("-------------------------------------------------");

        IntStream.rangeClosed(1,10)
                .parallel()
                .forEach(i -> System.out.println(Thread.currentThread().getName()+ ": " + i));
        System.out.println("-------------------------------------------------");
    }
}
