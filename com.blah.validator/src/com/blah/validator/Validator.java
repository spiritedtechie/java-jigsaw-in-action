package com.blah.validator;

public interface Validator<T> {

    boolean validate(T thingToValidate);
}
