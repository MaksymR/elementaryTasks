package com.softserve.dp_171_java.elementary.triangles.core;

import com.softserve.dp_171_java.elementary.triangles.core.impl.TriangleMathMethodsImpl;
import com.softserve.dp_171_java.elementary.triangles.entity.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TriangleMathMethodsTest {

    @Test
    public void calculateEqualsTriangleAreaByHeronTest() {
        //GIVEN
        Triangle triangle = mock(Triangle.class);
        when(triangle.getSideA()).thenReturn(3.0);
        when(triangle.getSideB()).thenReturn(4.0);
        when(triangle.getSideC()).thenReturn(5.0);
        double expectedAreaByHeron = 6.0;
        TriangleMathMethodsImpl triangleMathMethodsForTest = new TriangleMathMethodsImpl();
        //WHEN
        double actualAreaByHeron = triangleMathMethodsForTest.calculateTriangleAreaByHeron(triangle);
        //THEN
        assertEquals(expectedAreaByHeron, actualAreaByHeron, 0.0);
    }

    @Test
    public void calculateNotEqualsTriangleAreaByHeronTest() {
        //GIVEN
        Triangle triangle = mock(Triangle.class);
        when(triangle.getSideA()).thenReturn(3.0);
        when(triangle.getSideB()).thenReturn(4.0);
        when(triangle.getSideC()).thenReturn(5.0);
        TriangleMathMethodsImpl triangleMathMethodsForTest = new TriangleMathMethodsImpl();
        double unexpectedAreaByHeron = 5.9;
        //WHEN
        double actualAreaByHeron = triangleMathMethodsForTest.calculateTriangleAreaByHeron(triangle);
        //THEN
        assertNotEquals(unexpectedAreaByHeron, actualAreaByHeron);
    }

}