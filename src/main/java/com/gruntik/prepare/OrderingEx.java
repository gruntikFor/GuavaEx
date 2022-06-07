package com.gruntik.prepare;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;

public class OrderingEx {
    public static void main(String[] args) {
        Ordering<String> orderingStr = new Ordering<>() {
            @Override
            public int compare(String left, String right) {
                return ComparisonChain.start()
                        .compare(left, right)
                        .result();
            }
        };

        ArrayList<String> strings = new ArrayList<>(List.of("zbc", "bcd"));
        System.out.println(strings);

        strings.sort(orderingStr);
        System.out.println(strings);

        ArrayList<Integer> integersWithNull = new ArrayList<>();
        integersWithNull.add(8);
        integersWithNull.add(2);
        integersWithNull.add(23);

        System.out.println(integersWithNull);

        integersWithNull.sort(Ordering.natural().nullsFirst());
        System.out.println(integersWithNull);

        System.out.println(Ordering.natural().nullsFirst().isOrdered(integersWithNull));

        Integer min = Ordering.usingToString().nullsFirst().min(integersWithNull);
        System.out.println("min: " + min);

        ArrayList<String> names = new ArrayList<>(List.of("ysasha", "aasha", "igor"));
        System.out.println("names: " + names);

        names.sort(Ordering.natural().reversed());
        System.out.println("names sorted reverse: " + names);
    }
}
