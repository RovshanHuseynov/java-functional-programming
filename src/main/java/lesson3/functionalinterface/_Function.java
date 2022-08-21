package lesson3.functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementByOne(0));
        System.out.println(incrementByOneFunction.apply(0));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int incrementByOne(int number){
        return number+1;
    }
}