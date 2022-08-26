package lesson3.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000000123"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000123"));

        System.out.println("With Combined Predicates");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000"));

        System.out.println("With BiPredicate");
        System.out.println(isValidFullNameBiPredicate.test("Rovshan", "Huseynov"));
        System.out.println(isValidFullNameBiPredicate.test("Maria", "Timer"));
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");

    static BiPredicate<String, String> isValidFullNameBiPredicate =
            (name, surname) -> name.length() == 5 && surname.length() == 5;

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
