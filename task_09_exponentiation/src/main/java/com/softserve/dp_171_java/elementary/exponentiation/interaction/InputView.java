package com.softserve.dp_171_java.elementary.exponentiation.interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private Double numberForWork;
    private Integer exponentForWork;

    public void greeting() {

        System.out.println("\nYou can enter the number and the exponent of this number: <number>, <exponent>." +
                "\nI try to output the <number> raised to the <exponent>-th power");

    }

    public void askingNumberAndExponent() {

        while (true) {
            System.out.println("\nSo, enter the number and the exponent of this number" +
                    " in next format: <number>, <exponent>\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String numberAndExponent = bufferedReader.readLine();
                String[] arrayNumberAndExponent = workWithInputString(numberAndExponent);
                if (arrayNumberAndExponent == null) {
                    break;
                }
                if (numberForWork != null) {
                    numberForWork = null;
                }
                numberForWork = Double.parseDouble(arrayNumberAndExponent[0]);
                if (exponentForWork != null) {
                    exponentForWork = null;
                }
                exponentForWork = Integer.parseInt(arrayNumberAndExponent[1]);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("\nYou have inputted another symbol but not the digit" +
                        " (look at the format above, please)." +
                        " Try again, please");
                return;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("\nNot a correct inputting format (look at the format above, please)." +
                        " Try again, please");
                return;
            } catch (IOException ex) {
                System.out.println(ex);
                return;
            }
        }

    }

    private String[] workWithInputString(String numberAndExponent) {

        /*
           1. Zero or more whitespaces (\\s*)
           2. Arrow, or comma, or whitespace (=>|,|\\s)
           3. Zero or more whitespaces (\\s*)
         */
        String[] arrayNumberAndExponent = numberAndExponent.split("\\s*(=>|,|\\s)\\s*");
        if (arrayNumberAndExponent.length > 2) {
            System.out.println("\nIt was inputted a lot of parameters. (look at the format above, please)." +
                    " Try again, please");
            return null;
        }
        return arrayNumberAndExponent;

    }

    public Double getNumberForWork() {
        Double tempNumberForWork = numberForWork;
        numberForWork = null;
        return tempNumberForWork;
    }

    public Integer getExponentForWork() {
        Integer tempExponentForWork = exponentForWork;
        exponentForWork = null;
        return tempExponentForWork;
    }
}
