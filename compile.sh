#!/usr/bin/env bash
mkdir mods
javac -d mods/com.blah.addressmodel $(find com.blah.addressmodel -name *.java)
javac -d mods/com.blah.validator $(find com.blah.validator -name *.java)
javac --module-path mods -d mods/com.blah.validator.postcode $(find com.blah.validator.postcode -name *.java)
javac --module-path mods -d mods/com.blah.validator.address $(find com.blah.validator.address -name *.java)
javac --module-path mods -d mods/com.blah.myawesomeaddressvalidation $(find com.blah.myawesomeaddressvalidation -name *.java)

