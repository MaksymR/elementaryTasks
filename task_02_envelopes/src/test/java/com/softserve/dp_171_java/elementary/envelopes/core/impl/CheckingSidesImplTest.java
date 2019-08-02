package com.softserve.dp_171_java.elementary.envelopes.core.impl;

import com.softserve.dp_171_java.elementary.envelopes.core.CheckingSides;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingSidesImplTest {

    @Test
    public void checkSidesTrueTest() {
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
}