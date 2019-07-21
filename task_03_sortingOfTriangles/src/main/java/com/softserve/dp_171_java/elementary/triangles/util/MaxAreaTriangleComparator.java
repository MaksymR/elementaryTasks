package com.softserve.dp_171_java.elementary.triangles.util;

import com.softserve.dp_171_java.elementary.triangles.entity.Triangle;

import java.util.Comparator;

public class MaxAreaTriangleComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle triangleFirst, Triangle triangleSecond) {

        if (triangleFirst.getArea() > triangleSecond.getArea()) return -1;
        if (triangleFirst.getArea() < triangleSecond.getArea()) return 1;
        return 0;

    }

}
