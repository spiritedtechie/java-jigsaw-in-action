#!/usr/bin/env bash
mkdir mlib
jar -c -f mlib/com.blah.addressmodel@1.0.jar --module-version=1.0 -C mods/com.blah.addressmodel .
jar -c -f mlib/com.blah.validator.address@1.0.jar --module-version=1.0 -C mods/com.blah.validator.address .
jar -c -f mlib/com.blah.validator.postcode@1.0.jar --module-version=1.0 -C mods/com.blah.validator.postcode .
jar -c -f mlib/com.blah.validator@1.0.jar --module-version=1.0 -C mods/com.blah.validator .
jar -c -f mlib/com.blah.myawesomeaddressvalidation@1.0.jar -e com.blah.myawesomeaddressvalidation.AddressValidationApp -C mods/com.blah.myawesomeaddressvalidation .