#!/usr/bin/env bash
javac -d mods/com.blah.addressmodel com.blah.addressmodel/src/com/blah/address/Address.java com.blah.addressmodel/src/module-info.java
javac -d mods/com.blah.validator com.blah.validator/src/com/blah/validator/Validator.java com.blah.validator/src/module-info.java
javac --module-path mods -d mods/com.blah.validator.postcode com.blah.validator.postcode/src/com/blah/validator/postcode/PostcodeValidator.java com.blah.validator.postcode/src/module-info.java
javac --module-path mods -d mods/com.blah.validator.address com.blah.validator.address/src/com/blah/validator/address/AddressValidator.java com.blah.validator.address/src/module-info.java
javac --module-path mods -d mods/com.blah.myawesomeaddressvalidation com.blah.myawesomeaddressvalidation/src/com/blah/myawesomeaddressvalidation/AddressValidationApp.java com.blah.myawesomeaddressvalidation/src/module-info.java

