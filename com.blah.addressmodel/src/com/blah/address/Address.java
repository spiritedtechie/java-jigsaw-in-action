package com.blah.address;

public class Address {

    private final String line1;
    private final String line2;
    private final String city;
    private final String postcode;

    public Address(String line1, String line2, String city, String postcode) {

        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.postcode = postcode;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
