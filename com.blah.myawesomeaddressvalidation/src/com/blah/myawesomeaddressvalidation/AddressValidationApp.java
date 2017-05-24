package com.blah.myawesomeaddressvalidation;

import com.blah.address.Address;
import com.blah.validator.address.AddressValidator;

import java.util.function.Supplier;

public class AddressValidationApp {

    public static void main(String[] args) {

        Supplier<Address> addressThatIsValid = () -> new Address("33 Strange Street", "Camden", "London", "NW12FR");

        Supplier<Address> addressThatIsInvalid = () -> new Address("33 Strange Street", "Camden", "London", "FR12FR");

        Supplier<Address> addressThatIsInvalid2 = () -> new Address(null, "Camden", "London", "NW12FR");

        System.out.println(validate(addressThatIsValid));
        System.out.println(validate(addressThatIsInvalid));
        System.out.println(validate(addressThatIsInvalid2));
    }

    private static boolean validate(Supplier<Address> addressToValidate) {
        return new AddressValidator().validate(addressToValidate.get());
    }
}
