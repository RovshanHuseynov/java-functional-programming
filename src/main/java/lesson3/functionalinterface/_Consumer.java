package lesson3.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999");

        // Normal Java Function
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);

        // BiConsumer Functional Interface
        greetCustomerBiConsumer.accept(maria, true);
        greetCustomerBiConsumer.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> greetCustomer(customer);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNubmer)
           -> greetCustomer2(customer, showPhoneNubmer);

    static void greetCustomer(Customer custumer){
        System.out.println("Hello " + custumer.customerName + ", thanks for registering." +
                " Your number is " + custumer.customerPhoneNumber);
    }

    static void greetCustomer2(Customer custumer, boolean showPhoneNumber){
        System.out.println("Hello " + custumer.customerName + ", thanks for registering." +
                " Your number is " + (showPhoneNumber ? custumer.customerPhoneNumber : "******"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
