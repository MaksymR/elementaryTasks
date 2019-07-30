package com.softserve.dp_171_java.elementary.fibonacci.interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class OutputView {

    public void answerToTheTask(List<String> resultList) {
        if (resultList.isEmpty()) {
            return;
        }
        System.out.println("\nF0=0, F1=1, F2=1, F3=2, F4=3, F5=5, F6=8, F7=13, F8=21 (https://en.wikipedia.org/wiki/Fibonacci_number)");
        System.out.println("\nThe numeric sequence is: \n");
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + ", ");
            if ((i != 0) && ((i % 10) == 0)) {
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
