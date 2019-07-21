package com.softserve.dp_171_java.elementary.triangles.core;

import com.softserve.dp_171_java.elementary.triangles.entity.Triangle;

public interface TriangleMathMethods {

    /**
     * calculate the area of a triangle
     *
     * @param triangle for calculate the area
     * @return the area of the triangle
     */
    double calculateTriangleAreaByHeron(Triangle triangle);

}
