package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void reverseText() {
        assertEquals("llatsni ekam", Main.reverseText("make install"));
    }

    @org.junit.jupiter.api.Test
    void calculateQuadraticEquation() {
        double[] val = {1.0, -3.0, 2.0};
        double[] exp = {2.0, 1.0};
        double[] res = Main.calculateQuadraticEquation(val);
        assertArrayEquals(exp, res);
    }

    @org.junit.jupiter.api.Test
    void calculateSumOfSeries() {
        assertEquals(0.3972164755226014, Main.calculateSumOfSeries(2.0));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        assertEquals("This is a palindrome", Main.isPalindrome("Лёша на полке клопа нашёл."));
    }
}