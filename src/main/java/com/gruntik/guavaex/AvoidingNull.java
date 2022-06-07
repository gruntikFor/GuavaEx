package com.gruntik.guavaex;

import com.google.common.base.Strings;

import java.util.Optional;

public class AvoidingNull {
    public static void main(String[] args) {
        String name = new String("igor");

        Optional<String> str = Optional.of(name);

        Optional<String> ofNull = Optional.ofNullable(name);

        if (str.isPresent()) {
            System.out.println(str.get());
        }

        System.out.println(str.isPresent());

        String emptyToNull = Strings.emptyToNull("sdf   ");
        boolean isNullOrEmpty = Strings.isNullOrEmpty("");
        String nullToEmpty = Strings.nullToEmpty("nn");

        System.out.println("emptyToNull: " + emptyToNull);
        System.out.println(isNullOrEmpty);
        System.out.println("nullToEmpty:" +nullToEmpty);

    }
}
