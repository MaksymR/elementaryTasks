package com.softserve.dp_171_java.elementary.envelopes;

import com.softserve.dp_171_java.elementary.envelopes.core.CheckingSides;
import com.softserve.dp_171_java.elementary.envelopes.core.impl.CheckingSidesImpl;
import com.softserve.dp_171_java.elementary.envelopes.entity.Envelope;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Input a width of the first envelope (only one floating-point number): ");
                double firstWidth = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Input a height of the first envelope (only one floating-point number): ");
                double firstHeight = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Input a width of the second envelope (only one floating-point number): ");
                double secondWidth = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Input a height of the second envelope (only one floating-point number): ");
                double secondHeight = Double.parseDouble(bufferedReader.readLine());


                Envelope firstEnvelope = new Envelope(firstWidth, firstHeight);
                Envelope secondEnvelope = new Envelope(secondWidth, secondHeight);
                CheckingSides checkingSides = new CheckingSidesImpl();

                boolean temp = checkingSides.checkSides(firstEnvelope.getWidth(),
                        firstEnvelope.getHeight(),
                        secondEnvelope.getWidth(),
                        secondEnvelope.getHeight());

                System.out.println("\nCan you fit one envelope into another? -> " + temp);

                System.out.println("\nDo you want to continue?");
                System.out.println("Enter please \"y\" or \"yes\" (you can ignore character case).");
                System.out.println("If you want to exit then type another else, please.");

                String exitOrNo = bufferedReader.readLine();
                boolean exitY = exitOrNo.equalsIgnoreCase("y");
                boolean exitYes = exitOrNo.equalsIgnoreCase("yes");
                if ((!exitY) && (!exitYes)) {
                    break;
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("You have inputted a wrong format for the parameter of envelope\'s side" +
                    " (not the one floating-point number or another symbol). Try again, please");
        }

    }

}
