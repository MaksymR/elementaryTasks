package com.softserve.dp_171_java.elementary.fibonacci.interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private int digitForWorkFirst = 0;
    private int digitForWorkSecond = 0;


    public void greeting() {

        System.out.println("\nYou can input a digit (for the specified length) or two digits (for the\n" +
                "specified range) and I try to display all Fibonacci numbers that have the specified\n" +
                "length or are in the specified range.");

    }

    public void askingDigit() {

        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nSo, input a digit (for the specified length)" +
                    " or two digits (for the specified range): ");
            try {
                System.out.println("\nNow you are inputting a digit for the specified length:\n");
                digitForWorkFirst = Integer.parseInt(bufferedReader.readLine());
                if (digitForWorkFirst < 0) {
                    System.out.println("\nDon't enter the negative digit, please!");
                    break;
                } else if (digitForWorkFirst != 0) {
                    System.out.println("\nDo you want to input the specified range?" +
                            " Enter please \"y\" or \"yes\" (you can ignore character case).\n");
                    String inputOrNorSecondDigit = bufferedReader.readLine();
                    boolean inputY = inputOrNorSecondDigit.equalsIgnoreCase("y");
                    boolean inputYes = inputOrNorSecondDigit.equalsIgnoreCase("yes");
                    if ((inputY) | (inputYes)) {
                        enteringTwoDigitsForSpecifiedRange(bufferedReader);
                        break;
                    } else {
                        digitForWorkSecond = 0;
                        break;
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("\nYou have inputted another symbol but not the digit." +
                        " Try again, please");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

    private void enteringTwoDigitsForSpecifiedRange(BufferedReader bufferedReader) throws IOException {
        System.out.println("\nInput two digits, please.");
        System.out.println("\nInput the first digit for the specified range, please");
        digitForWorkFirst = Integer.parseInt(bufferedReader.readLine());
        if (digitForWorkFirst < 0) {
            System.out.println("\nDon't enter the negative digit, please!");
            return;
        }
        System.out.println("\nInput the second digit for the specified range, please");
        digitForWorkSecond = Integer.parseInt(bufferedReader.readLine());
        if (digitForWorkSecond < 0) {
            System.out.println("\nDon't enter the negative digit, please!");
            return;
        }
    }


    public int getDigitForWorkFirst() {
        return digitForWorkFirst;
    }

    public int getDigitForWorkSecond() {
        return digitForWorkSecond;
    }
}
