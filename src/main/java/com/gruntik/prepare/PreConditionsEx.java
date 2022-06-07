package com.gruntik.prepare;

import java.util.Objects;

import static com.google.common.base.Preconditions.*;

public class PreConditionsEx {
    public static void main(String[] args) {
        int number = 2;
        checkArgument(number > 0, "Number %s should be more then 0", number);

        String str = "string val";
        checkNotNull(str, "String should be not null");
        checkState(number > 0, "%s should be more then 0", number);


    }
}
