package com.kishdizon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//tests classes not public since nothing outside test framework calls them directly
class CalculatorTest {
    Logger logger;
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator("Test Calculator", logger );
    }

    @Test
    void testAdd() {
        assertEquals(8, calc.add(6,2));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(10,8));
    }

    @Test
    void testMultiply() {
        assertEquals(49, calc.multiply(7,7));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10,0));
    }

    @Test
    @Disabled
    void testExponent() {
        // yet to be implemented
    }
}
