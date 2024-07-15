package com.gmail.dmytronechkaliuk.homeworks.homework16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero() {
        int result = calculator.add(0, 0);
        assertEquals(0, result, "Was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne() {
        int result = calculator.add(1, 1);
        assertEquals(2, result);
    }

    @Test()
    @Disabled
    public void canAddMaxIntPlusOne() {
        int result = calculator.add(Integer.MAX_VALUE, 1);
        System.out.println(result); // 2147483647
        assertEquals(Integer.MAX_VALUE + 1L, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(2, 3);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

}
