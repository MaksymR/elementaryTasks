package com.softserve.dp_171_java.elementary.exponentiation.service;

public class WorkingWithBaseAndExponent {

    public double pow(double base, int exponent) {

        double tempValue;
        if (exponent == 0)
            return 1;
        tempValue = pow(base, exponent / 2);

        if (exponent % 2 == 0)
            return tempValue * tempValue;
        else {
            if (exponent > 0)
                return base * tempValue * tempValue;
            else
                return (tempValue * tempValue) / base;
        }

    }

}
