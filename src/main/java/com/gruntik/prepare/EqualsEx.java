package com.gruntik.prepare;

import com.google.common.base.Objects;

public class EqualsEx {
    public static void main(String[] args) {
        boolean i = Objects.equal("i", "i");
        System.out.println(i);

        boolean i2 = java.util.Objects.equals("i", "i");
        System.out.println(i2);

        Pet sem = new Pet("sem", 12);
        System.out.println(sem.hashCode());
        System.out.println(java.util.Objects.hashCode(sem));

    }
}
