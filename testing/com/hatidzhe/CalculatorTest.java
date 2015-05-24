package com.hatidzhe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hatidzhe on 15-5-24.
 */
public class CalculatorTest {

    @Test
    public void testKcalToWh() throws Exception {
        double kcal = 5;
        double calculatedWh = Calculator.kcalToWh(kcal);
        double expectedWh = 5.815;
        assertEquals(expectedWh, calculatedWh, 0.000001);

    }
}