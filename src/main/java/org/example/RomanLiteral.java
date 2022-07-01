package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanLiteral {
    I(1), IV(4), V(5), IX(9), X(10);

    private final int value;

    RomanLiteral(int value) {

        this.value = value;
    }

    public static List<RomanLiteral> orderByDescending() {
        List<RomanLiteral> romanLiterals = Arrays.asList(RomanLiteral.values());
        return romanLiterals.stream().sorted(Comparator.comparingInt(RomanLiteral::value).reversed()).collect(Collectors.toList());
    }


    public int value() {
        return value;
    }

}
