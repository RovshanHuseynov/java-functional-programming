package lesson3.functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999");

        // Normal Java Function
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> greetCustomer(customer);

    static void greetCustomer(Customer custumer){
        System.out.println("Hello " + custumer.customerName + ", thanks for registering." +
                " Your number is " + custumer.customerPhoneNumber);
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
