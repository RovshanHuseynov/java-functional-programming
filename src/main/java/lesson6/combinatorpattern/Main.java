package lesson6.combinatorpattern;

import java.time.LocalDate;

import static lesson6.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    // main concept of CombinatorPattern is that it returns another Function as result
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+0123",
                LocalDate.of(2000, 1, 1));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValidCustomer(customer));

        // if valid we can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(!result.equals(ValidationResult.SUCCESS)){
            throw new IllegalStateException(result.name());
        }
    }
}
