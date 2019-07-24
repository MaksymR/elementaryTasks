package com.softserve.dp_171_java.elementary.converter.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    public void greeting() {

        System.out.println("\nYou can input a digit number and I try to convert it into a word)");

    }

    public int askingDigitsNames() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("So, input a digit number:\n");
        int digitNumber = 0;
        try {
            digitNumber = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("You have inputted another symbol but not the digit." +
                    " Try again, please");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return digitNumber;
    }
}
