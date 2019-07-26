package com.softserve.dp_171_java.elementary.sequence.service;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithDigit {

    private final static int EXPONENT = 2;

    public Map<Integer, Integer> workWithDigit(int digit) {
        if (digit <= 0) {
            System.out.println("\nDon't enter a negative digit, please");
        }
        Map<Integer, Integer> resultList = new HashMap<>();
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
