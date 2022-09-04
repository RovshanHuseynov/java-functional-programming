package lesson7.finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Rovshan", null,
                firstName -> System.out.println("no lastName is provided for " + firstName));

        hello2("Rovshan", null,
                () -> System.out.println("no last name is provided"));
    }

    static void hello(String firstName, String lastName,
                      Consumer<String> callback){
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    /*
    javascript
    function hello(firstName, lastName, callback){
        console.log(firstName);
        if(lastName){  // lastName is provided
            console.log(lastName);
        } else {   // no lastName is provided
            callback(); // callback() is just extra function
        }
    }*/
}