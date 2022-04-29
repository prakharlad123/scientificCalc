package com.iiitb.scientificCalc;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calculatorControllerTest {
    private static final double DELTA = 1e-15;
    calculatorController calculator = new calculatorController();

    @Test
    public void squareRootTruePositive() {
        Map<String, String> p1 = new HashMap();

        p1.put("input1", "16");
        assertEquals("Square root of true positive", 4, calculator.getSquareRoot(p1), DELTA);
    }

    @Test
    public void squareRootFalsePositive() {
        Map<String, String> p1 = new HashMap();

        p1.put("input1", "16");
        assertNotEquals("Square root of false positive", 5, calculator.getSquareRoot(p1), DELTA);
    }
}
