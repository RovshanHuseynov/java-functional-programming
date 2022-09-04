package lesson7.finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        Function<String, String> upperCaseName2 = String::toUpperCase;
        Function<String, String> upperCaseName3 = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex"));
        System.out.println(upperCaseName2.apply("Alex"));
        System.out.println(upperCaseName3.apply(""));
    }
}
