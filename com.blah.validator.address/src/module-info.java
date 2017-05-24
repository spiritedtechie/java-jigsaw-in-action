module com.blah.validator.address {
    requires com.blah.validator;
    requires transitive com.blah.addressmodel;
    requires com.blah.validator.postcode;
    exports com.blah.validator.address;

}