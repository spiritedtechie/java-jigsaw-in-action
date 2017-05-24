module com.blah.addressvalidator {
    requires com.blah.validator;
    requires com.blah.addressmodel;
    requires com.blah.postcodevalidator;
    exports com.blah.validator.address;
}