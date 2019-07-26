package com.softserve.dp_171_java.elementary.sequence.interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class OutputView {

    public void answerToTheTask(Map<Integer, Integer> result) {

        if (result.isEmpty()) {
            return;
        }
        System.out.println("\nThe numeric sequence is: \n");
        for (int i = 1; i <= result.size(); i++) {
            System.out.print(i + "=" + result.get(i) + ", ");
            if ((i % 10) == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }

    public boolean comeOutOrNot() {

        System.out.println("\nDo you want to continue?");
        System.out.println("Enter please \"y\" or \"yes\" (you can ignore character case).");
        System.out.println("If you want to exit then type another else, please.");

        BufferedReader bufferedReaderForOut = new BufferedReader(new InputStreamReader(System.in));
        String exitOrNo = null;
        try {
            exitOrNo = bufferedReaderForOut.readLine();
        } catch (IOException ex) {
            System.out.println("BufferedReader is existing");
        }
        boolean exitY = exitOrNo.equalsIgnoreCase("y");
        boolean exitYes = exitOrNo.equalsIgnoreCase("yes");
        if ((!exitY) && (!exitYes)) {
            try {
                bufferedReaderForOut.close();
            } catch (IOException ex) {
                System.out.println("BufferedReader is closed");
            }
            return true;
        }
        return false;

    }
}

