package com.softserve.dp_171_java.elementary.sequence.service;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithDigit {

    private final static int EXPONENT = 2;

    public Map<Integer, Integer> workWithDigit(int digit) {

        Map<Integer, Integer> resultList = new HashMap<>();

        if (digit <= 0) {
            System.out.println("\nDon't enter a negative digit, please");
        }

        /*
        If a "digit" (from argument) is zero or negative number then next cycle "for" does not work,
        because condition "i < digit" (e.g. -> "1 < 0" or "1 < -1") is false.
        */
        for (int i = 1; i < digit; i++) {
            int tempValue = (int) Math.pow(i, EXPONENT);
            if (tempValue < digit) {
                resultList.put(i, tempValue);
            } else {
                break;
            }
        }

        return resultList;

    }

}
