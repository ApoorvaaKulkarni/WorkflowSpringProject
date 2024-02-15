package com.example.math.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.math.math.controller.MathCalculator;

@SpringBootTest
public class MathCalculatorTest {
    @Test
    public void testAdd() {
        MathCalculator.SimpleCalculator calculator = new MathCalculator().new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void testSubtract() {
        MathCalculator.SimpleCalculator calculator = new MathCalculator().new SimpleCalculator();
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(-7, calculator.subtract(3, 10));
        assertEquals(0, calculator.subtract(10, 10));
    }
}