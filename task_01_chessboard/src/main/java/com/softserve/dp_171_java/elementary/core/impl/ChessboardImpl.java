package com.softserve.dp_171_java.elementary.core.impl;

import com.softserve.dp_171_java.elementary.core.Chessboard;

public class ChessboardImpl implements Chessboard {

    private static final String ASTERISK = "\u002A";
    private static final String SPACE = "\u0020";


    private int height;
    private int width;

    public ChessboardImpl(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void createChessboard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (((i + j) % 2) == 0) {
                    System.out.print(ASTERISK);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
