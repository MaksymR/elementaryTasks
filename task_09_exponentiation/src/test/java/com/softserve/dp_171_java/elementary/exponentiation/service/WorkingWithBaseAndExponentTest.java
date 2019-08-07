package com.softserve.dp_171_java.elementary.exponentiation.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkingWithBaseAndExponentTest {

    @Test
    public void powEqualsForPositiveExponentTest() {
        //GIVEN
        WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
        double expected = 1024;
        //WHEN
        double actual = workingWithBaseAndExponent.pow(2, 10);
        //THEN
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void powEqualsForZeroExponentTest() {
        //GIVEN
        WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
        double expected = 1;
        //WHEN
        double actual = workingWithBaseAndExponent.pow(2, 0);
        //THEN
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void powEqualsForNegativeExponentTest() {
        //GIVEN
        WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
        double expected = 0.125;
        //WHEN
        double actual = workingWithBaseAndExponent.pow(2, -3);
        //THEN
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void powEqualsForZeroBaseTest() {
        //GIVEN
        WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
        double expected = 0;
        //WHEN
        double actual = workingWithBaseAndExponent.pow(0, 10);
        //THEN
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void powEqualsForZeroBaseZeroExponentTest() {
        //GIVEN
        WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
        double expected = 1;
        //WHEN
        double actual = workingWithBaseAndExponent.pow(0, 0);
        //THEN
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void powEqualsForZeroBaseNegativeExponentTest() {
        //GIVEN
        WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
        double expected = 0;
        //WHEN
        double actual = workingWithBaseAndExponent.pow(0, -2);
        //THEN
        Assert.assertNotEquals(expected, actual, 0.0);
    }
}