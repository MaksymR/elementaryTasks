package com.softserve.dp_171_java.elementary;

import com.softserve.dp_171_java.elementary.core.Chessboard;
import com.softserve.dp_171_java.elementary.core.impl.ChessboardImpl;

public class App {

    public static void main(String[] args) {

        try {

            int height = getArgsElement(args, 0);
            int width = getArgsElement(args, 1);

            if ((height <= 0) && (width <=0)) {
                System.out.println("Entering arguments have to been more than zero." +
                        " Try again with using positive number, please");
                return;
            }

            Chessboard chessboard = new ChessboardImpl(height, width);
            chessboard.createChessboard();

        } catch (NumberFormatException ex) {

            System.out.println("Arguments were entered in the wrong format." +
                    " Try again with using integer digits, please.");

        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Enter two integer digits, please.");

        }


    }

    private static int getArgsElement(String[] args, int i) {
        String argsElement = args[i];
        return Integer.parseInt(argsElement);
    }

}
