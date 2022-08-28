package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
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
