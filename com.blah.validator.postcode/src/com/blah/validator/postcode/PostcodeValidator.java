package com.blah.validator.postcode;

import com.blah.validator.Validator;

public class PostcodeValidator implements Validator<String> {

    @Override
    public boolean validate(String thingToValidate) {
        return thingToValidate.startsWith("NW");
    }
}
