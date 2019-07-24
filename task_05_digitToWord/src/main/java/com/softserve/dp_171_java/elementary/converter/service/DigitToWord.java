package com.softserve.dp_171_java.elementary.converter.service;

import static com.softserve.dp_171_java.elementary.converter.myLibrary.DigitsNames.*;

public class DigitToWord {

    public String convert(int digit) {

        if (digit == 0) {
            return "zero";
        }

        String prefix = "";

        if (digit < 0) {
            digit = -digit;
            prefix = "negative ";
        }

        String current = "";
        int placeForDigitThousandAndMore = 0;

        do {
            int n = digit % 1000;
            if (n != 0) {
                String s = convertLessThanOneThousand(n);
                current = s + OTHER_DIGITS_NAMES_TO_INFINITY[placeForDigitThousandAndMore] + current;
            }
            placeForDigitThousandAndMore++;
            digit /= 1000;
        } while (digit > 0);

        return (prefix + current);

    }

    private String convertLessThanOneThousand(int digitLessThanOneThousand) {

        String current;

        if ((digitLessThanOneThousand % 100) < 20) {
            current = SIMPLE_DIGITS_NAMES_TO_NINETEEN[digitLessThanOneThousand % 100];
            digitLessThanOneThousand /= 100;
        } else {
            current = SIMPLE_DIGITS_NAMES_TO_NINETEEN[digitLessThanOneThousand % 10];
            digitLessThanOneThousand /= 10;

            current = TENS_DIGIT_NAMES_TO_NINTY[digitLessThanOneThousand % 10] + current;
            digitLessThanOneThousand /= 10;
        }
        if (digitLessThanOneThousand == 0) return current;
        return SIMPLE_DIGITS_NAMES_TO_NINETEEN[digitLessThanOneThousand] + " hundred" + current;

    }

}
