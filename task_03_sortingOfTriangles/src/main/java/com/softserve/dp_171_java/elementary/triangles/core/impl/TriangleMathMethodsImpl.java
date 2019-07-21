package com.softserve.dp_171_java.elementary.triangles.core.impl;

import com.softserve.dp_171_java.elementary.triangles.core.TriangleMathMethods;
import com.softserve.dp_171_java.elementary.triangles.entity.Triangle;

public class TriangleMathMethodsImpl implements TriangleMathMethods {

    @Override
    public double calculateTriangleAreaByHeron(Triangle triangle) {

        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();
        double halfTrianglesPerimeter = calculateHalfTrianglesPerimeter(sideA, sideB, sideC);
        double areaOfTriangle = Math.sqrt(halfTrianglesPerimeter
                * (halfTrianglesPerimeter - sideA)
                * (halfTrianglesPerimeter - sideB)
                * (halfTrianglesPerimeter - sideC));
        return areaOfTriangle;

    }

    private double calculateHalfTrianglesPerimeter(double sideA, double sideB, double sideC) {

        return (sideA + sideB + sideC) / 2;

    }
}
