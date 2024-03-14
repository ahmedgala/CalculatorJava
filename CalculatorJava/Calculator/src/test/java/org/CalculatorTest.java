package org;

import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void TestAdd() {
        Assertions.assertEquals(4, calculator.Add(2, 2), "2+2 should be equal 4");
    }

    @Test
    public void TestSubtract() {
        Assertions.assertEquals(0, calculator.Subtract(2, 2), "0-0 should be equal 0");

    }

    @Test
    public void TestMultiply() {
        Assertions.assertEquals(4, calculator.Multiply(2, 2), "2*2 should be equal 4");

    }

    @Test
    public void TestDivision() {
        Assertions.assertEquals(1, calculator.Division(2, 2), "2/2 should be equal 1");
    }
}
