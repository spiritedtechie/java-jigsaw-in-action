package com.blah.validator.address;

import com.blah.address.Address;
import com.blah.validator.Validator;
import com.blah.validator.postcode.PostcodeValidator;

public class AddressValidator implements Validator<Address> {
    @Override
    public boolean validate(Address thingToValidate) {
        return thingToValidate.getCity() != null &&
                thingToValidate.getLine1() != null &&
                thingToValidate.getLine2() != null &&
                thingToValidate.getPostcode() != null &&
                new PostcodeValidator().validate(thingToValidate.getPostcode());
    }
}
