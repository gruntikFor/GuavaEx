package com.gruntik.prepare;

import com.google.common.base.Throwables;

public class ThrowableEx {
    public static void main(String[] args) {

        int a = 0;
        int b = 2;


        try {
            int div = b / a;
        } catch (Throwable t) {
            Throwables.throwIfInstanceOf(t, OutOfMemoryError.class);
        }

    }
}
