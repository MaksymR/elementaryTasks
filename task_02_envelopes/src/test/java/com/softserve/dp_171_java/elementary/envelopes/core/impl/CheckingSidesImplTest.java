package com.softserve.dp_171_java.elementary.envelopes.core.impl;

import com.softserve.dp_171_java.elementary.envelopes.core.CheckingSides;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingSidesImplTest {

    @Test
    public void checkSidesFirstEnvLessSecEnvTrueTest() {
        //GIVEN
        CheckingSidesImpl checkingSides = new CheckingSidesImpl();
        //WHEN
        //THEN
        assertTrue(checkingSides.checkSides(1.0,
                2.0,
                4.0,
                5.0));
    }

    @Test
    public void checkSidesSecEnvLessFirstEnvTrueTest() {
        //GIVEN
        CheckingSidesImpl checkingSides = new CheckingSidesImpl();
        //WHEN
        //THEN
        assertTrue(checkingSides.checkSides(5.0,
                4.0,
                1.0,
                2.0));
    }


    @Test
    public void checkSidesTrueEqualsTest() {
        //GIVEN
        CheckingSidesImpl checkingSides = new CheckingSidesImpl();
        boolean expected = true;
        //WHEN
        boolean actual = checkingSides.checkSides(1.0,
                2.0,
                4.0,
                5.0);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void checkSidesFalseEqualsTest() {
        //GIVEN
        CheckingSidesImpl checkingSides = new CheckingSidesImpl();
        boolean expected = false;
        //WHEN
        boolean actual = checkingSides.checkSides(1.0,
                1.0,
                1.0,
                1.0);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void checkSidesNotEqualsTest() {
        //GIVEN
        CheckingSidesImpl checkingSides = new CheckingSidesImpl();
        boolean unexpected = true;
        //WHEN
        boolean actual = checkingSides.checkSides(1.0,
                1.0,
                -1.0,
                -1.0);
        //THEN
        assertNotEquals(unexpected, actual);
    }

    @Test
    public void checkSidesFalseTest() {
        //GIVEN
        CheckingSides checkingSides = new CheckingSidesImpl();
        //WHEN
        //THEN
        assertFalse(checkingSides.checkSides(
                1.0,
                2.0,
                1.0,
                2.0));
    }

    @Test
    public void checkSidesSecEnvLessFirstEnvFalseTest() {
        //GIVEN
        CheckingSides checkingSides = new CheckingSidesImpl();
        //WHEN
        //THEN
        assertFalse(checkingSides.checkSides(
                5.0,
                4.0,
                4.0,
                4.0));
    }

    @Test
    public void checkSidesFirstEnvelopeLessSecondEnvelopeFalseTest() {
        //GIVEN
        CheckingSides checkingSides = new CheckingSidesImpl();
        //WHEN
        //THEN
        assertFalse(checkingSides.checkSides(
                4.0,
                4.0,
                5.0,
                4.0));
    }
}