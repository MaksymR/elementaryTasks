package com.softserve.dp_171_java.elementary.fibonacci.service;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WorkingWithDigitForFibonacciSeriesTest {

    @Test
    public void fibonacciForSpecifiedLengthEqualsTest() {
        //GIVEN
        WorkingWithDigitForFibonacciSeries workingWithDigitForFibonacciSeries =
                new WorkingWithDigitForFibonacciSeries();
        List<String> expected = new ArrayList<>();
        expected.add("F0=0");
        expected.add("F1=1");
        expected.add("F2=1");
        expected.add("F3=2");
        //WHEN
        List<String> actual = workingWithDigitForFibonacciSeries.fibonacciForSpecifiedLength(3);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciForSpecifiedRangeEqualsTest() {
        WorkingWithDigitForFibonacciSeries workingWithDigitForFibonacciSeries =
                new WorkingWithDigitForFibonacciSeries();
        List<String> expected = new ArrayList<>();
        expected.add("F7=13");
        //WHEN
        List<String> actual =
                workingWithDigitForFibonacciSeries.fibonacciForSpecifiedRange(10, 20);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacciForSpecifiedLengtNothEqualsTest() {
        //GIVEN
        WorkingWithDigitForFibonacciSeries workingWithDigitForFibonacciSeries =
                new WorkingWithDigitForFibonacciSeries();
        List<String> expected = new ArrayList<>();
        expected.add("F0=0");
        expected.add("F1=1");
        expected.add("F2=1");
        expected.add("F3=2");
        //WHEN
        List<String> actual = workingWithDigitForFibonacciSeries.fibonacciForSpecifiedLength(5);
        //THEN
        assertNotEquals(expected, actual);
    }

    @Test
    public void fibonacciForSpecifiedRangeNotEqualsTest() {
        WorkingWithDigitForFibonacciSeries workingWithDigitForFibonacciSeries =
                new WorkingWithDigitForFibonacciSeries();
        List<String> expected = new ArrayList<>();
        expected.add("F7=13");
        //WHEN
        List<String> actual =
                workingWithDigitForFibonacciSeries.fibonacciForSpecifiedRange(100, 1000);
        //THEN
        assertNotEquals(expected, actual);
    }

}
