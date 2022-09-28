package lesson14.skipandlimit;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for(int i=2; i<=7; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------");

        list.stream()
                .skip(2)
                .limit(6)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("----------------------------------------");
    }
}
