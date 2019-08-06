package com.softserve.dp_171_java.elementary.sequence.service;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithDigitTest {

    @Test
    public void workWithDigitEqualsTest() {
        //GIVEN
        WorkingWithDigit workingWithDigit = new WorkingWithDigit();
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 4);
        expected.put(3, 9);
        //WHEN
        Map<Integer, Integer> actual = workingWithDigit.workWithDigit(10);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void workWithZeroDigitDigitEqualsTest() {
        //GIVEN
        WorkingWithDigit workingWithDigit = new WorkingWithDigit();
        Map<Integer, Integer> expected = new HashMap<>();
        //WHEN
        Map<Integer, Integer> actual = workingWithDigit.workWithDigit(0);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void workWithNegativeDigitDigitEqualsTest() {
        //GIVEN
        WorkingWithDigit workingWithDigit = new WorkingWithDigit();
        Map<Integer, Integer> expected = new HashMap<>();
        //WHEN
        Map<Integer, Integer> actual = workingWithDigit.workWithDigit(-10);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void workWithDigitNotEqualsTest() {
        //GIVEN
        WorkingWithDigit workingWithDigit = new WorkingWithDigit();
        Map<Integer, Integer> unexpected = new HashMap<>();
        unexpected.put(1, 0);
        unexpected.put(2, 1);
        unexpected.put(3, 2);
        //WHEN
        Map<Integer, Integer> actual = workingWithDigit.workWithDigit(10);
        //THEN
        Assert.assertNotEquals(unexpected, actual);
    }

    @Test
    public void workWithZeroDigitDigitNotEqualsTest() {
        //GIVEN
        WorkingWithDigit workingWithDigit = new WorkingWithDigit();
        Map<Integer, Integer> unexpected = new HashMap<>();
        unexpected.put(1, 1);
        unexpected.put(2, 2);
        unexpected.put(3, 3);
        //WHEN
        Map<Integer, Integer> actual = workingWithDigit.workWithDigit(0);
        //THEN
        Assert.assertNotEquals(unexpected, actual);
    }

    @Test
    public void workWithNegativeDigitDigitNotEqualsTest() {
        //GIVEN
        WorkingWithDigit workingWithDigit = new WorkingWithDigit();
        Map<Integer, Integer> unexpected = new HashMap<>();
        unexpected.put(1, 1);
        unexpected.put(2, 2);
        unexpected.put(3, 3);
        //WHEN
        Map<Integer, Integer> actual = workingWithDigit.workWithDigit(-10);
        //THEN
        Assert.assertNotEquals(unexpected, actual);
    }
}
