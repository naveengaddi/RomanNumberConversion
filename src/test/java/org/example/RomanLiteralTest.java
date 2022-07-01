package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RomanLiteralTest {

    @Test
    void shouldReturnValue1ForI() {
        assertEquals(1, RomanLiteral.I.value());
    }

    @Test
    void shouldReturnValue5ForV() {
        assertEquals(5, RomanLiteral.V.value());
    }

    @Test
    void shouldReturnValue10ForX() {
        assertEquals(10, RomanLiteral.X.value());
    }

    @Test
    void shouldReturnXAsStringForX() {
        assertEquals("X", RomanLiteral.X.toString());
    }

    @Test
    void shouldReturnListInDescendingOrder() {
        List<RomanLiteral> romanLiterals = RomanLiteral.orderByDescending();
        assertEquals(5, romanLiterals.size());
        assertEquals(RomanLiteral.X, romanLiterals.get(0));
        assertEquals(RomanLiteral.IX, romanLiterals.get(1));
        assertEquals(RomanLiteral.V, romanLiterals.get(2));
        assertEquals(RomanLiteral.IV, romanLiterals.get(3));
        assertEquals(RomanLiteral.I, romanLiterals.get(romanLiterals.size()-1));
    }
}