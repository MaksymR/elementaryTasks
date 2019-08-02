package com.softserve.dp_171_java.elementary.fibonacci.service;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithDigitForFibonacciSeries {

    public List<String> fibonacciForSpecifiedLength(int digitFirst) {

        List<String> fibonacciListForSpecifiedLength = new ArrayList<>();

        for (int i = 0; i <= digitFirst; i++) {
            fibonacciListForSpecifiedLength.add("F" + i + "=" + getFibonacci(i));
        }

        return fibonacciListForSpecifiedLength;
    }

    public List<String> fibonacciForSpecifiedRange(int digitFirst, int digitSecond) {

        List<String> fibonacciListForSpecifiedRange = new ArrayList<>();

        for (int i = 0; true; i++) {
            if (((getFibonacci(i)) >= digitFirst) && ((getFibonacci(i) <= digitSecond))) {
                fibonacciListForSpecifiedRange.add("F" + i + "=" + getFibonacci(i));
            } else if (getFibonacci(i) > digitSecond) {
                break;
            }

        }

        return fibonacciListForSpecifiedRange;
    }

    private Integer getFibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int firstDigit = 0;
        int secondDigit = 1;
        int nextDigit = 1;

        for (int i = 2; i <= n; i++) {
            nextDigit = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = nextDigit;
        }
        return nextDigit;
    }
}