package com.softserve.dp_171_java.elementary.converter.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DigitToWordTest {

    @Test
    public void convertEqualsTest() {
        //GIVEN
        DigitToWord digitToWord = new DigitToWord();
        String expected = " one million";
        //WHEN
        String actual = digitToWord.convert(1000000);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void convertEqualsNegativeTest() {
        //GIVEN
        DigitToWord digitToWord = new DigitToWord();
        String expected = "negative  one million";
        //WHEN
        String actual = digitToWord.convert(-1000000);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void convertNotEqualsTest() {
        //GIVEN
        DigitToWord digitToWord = new DigitToWord();
        String expected = " one thousand";
        //WHEN
        String actual = digitToWord.convert(1000000);
        //THEN
        assertNotEquals(expected, actual);

    }

    @Test
    public void convertNotEqualsNegativeTest() {
        //GIVEN
        DigitToWord digitToWord = new DigitToWord();
        String expected = "negative  one million";
        //WHEN
        String actual = digitToWord.convert(1000000);
        //THEN
        assertNotEquals(expected, actual);
    }
}