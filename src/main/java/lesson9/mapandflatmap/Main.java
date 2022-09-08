package lesson9.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());

        // 1. convert List<Customer> to List<String>   -> Data Transformation
        customers.stream()
                .map(customer -> customer.getName())
                .collect(Collectors.toList())
                .forEach(value -> System.out.print(value + ", "));
        System.out.println();

        // 2. convert List<List<String>> to List<String> using flatMap
        List<List<String>> phoneNumbersOfEachCustomer = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbersOfEachCustomer);

        List<String> allPhoneNumbers = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(allPhoneNumbers);
    }
}
