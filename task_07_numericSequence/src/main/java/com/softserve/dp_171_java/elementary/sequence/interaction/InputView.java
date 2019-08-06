package com.softserve.dp_171_java.elementary.sequence.interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private int digitForWork = 0;


    public void greeting() {

        System.out.println("\nYou can input a digit and I try to output the line of the numeric sequence" +
                " where digits square will be less than a given number");

    }

    public void askingDigit() {

        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nSo, input a digit: \n");
            try {
                digitForWork = Integer.parseInt(bufferedReader.readLine());
                if (digitForWork != 0) {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("\nYou have inputted another symbol but not the digit." +
                        " Try again, please");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

    public int getDigitForWork() {
        int numberForReturn = digitForWork;
        digitForWork = 0;
        return numberForReturn;
    }
}

