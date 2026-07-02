package com.skillspractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add_shouldReturnSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtract_shouldReturnDifference() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(42, calculator.multiply(6, 7));
    }

    @Test
    void divide_shouldReturnQuotient() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void divide_byZero_shouldThrow() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    void factorial_shouldReturnCorrectValue() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void factorial_ofNegativeNumber_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }
}
