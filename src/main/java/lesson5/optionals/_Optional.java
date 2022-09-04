package lesson5.optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null)
                .orElseGet(() -> "default value"));

        System.out.println(Optional.ofNullable("Hello")
                .orElse("default value"));

        Optional.ofNullable("John@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to: " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to: " + email) ,
                        () -> System.out.println("Cannot send email"));

        System.out.println(Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("exception")));
    }
}