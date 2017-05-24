module com.blah.addressmodel {
    exports com.blah.address;

    // NOTE how we are not exporting privateaddressstuff as we don't want anyone to see this on the classpath
    // This demonstrates the module level encapsulation of packages, so the AddressEncryptor class is module public
}