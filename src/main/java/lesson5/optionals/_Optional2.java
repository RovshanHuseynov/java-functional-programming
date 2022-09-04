package lesson5.optionals;

import java.util.Optional;

public class _Optional2 {
    // source: https://www.youtube.com/watch?v=1xCxoOuDZuU
    public static void main(String[] args) {
        Optional<String> helloOpt = Optional.ofNullable("Hello");

        String s = helloOpt.map(value -> value.toUpperCase())
                .orElseThrow(IllegalStateException::new);

        System.out.println(s);

        helloOpt.ifPresentOrElse(value -> System.out.println(value),
                () -> System.out.println("world"));
    }
}
