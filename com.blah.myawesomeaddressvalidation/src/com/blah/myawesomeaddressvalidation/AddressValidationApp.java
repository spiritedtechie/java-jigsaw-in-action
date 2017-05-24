package com.blah.myawesomeaddressvalidation;

import com.blah.address.Address;
import com.blah.validator.Validator;
import com.blah.validator.address.AddressValidator;

import java.util.function.Supplier;

public class AddressValidationApp {

    public static void main(String[] args) {

        Validator<Address> strangeStreetValidator = address -> address.getLine1().toLowerCase().contains("strange");

        Supplier<Address> address1 = () -> new Address("33 Strange Street", "Camden", "London", "NW12FR");
        Supplier<Address> address2 = () -> new Address("33 Strange Street", "Camden", "London", "FR12FR");
        Supplier<Address> address3 = () -> new Address(null, "Camden", "London", "NW12FR");
        Supplier<Address> address4 = () -> new Address("21 Bob Street", "Camden", "London", "NW12FR");

        printIsValid(validate(address1));
        printIsValid(validate(address2));
        printIsValid(validate(address3));
        printIsValid(strangeStreetValidator.validate(address1.get()));
        printIsValid(strangeStreetValidator.validate(address4.get()));
    }

    private static void printIsValid(boolean result) {
        System.out.println("Is valid? " + result);
    }

    private static boolean validate(Supplier<Address> addressToValidate) {
        return new AddressValidator().validate(addressToValidate.get());
    }
}
