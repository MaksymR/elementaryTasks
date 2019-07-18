package com.softserve.dp_171_java.elementary.envelopes.core.impl;

import com.softserve.dp_171_java.elementary.envelopes.core.CheckingSides;

public class CheckingSidesImpl implements CheckingSides {

    @Override
    public boolean checkSides(double widthFirstEnvelope,
                              double heightFirstEnvelope,
                              double widthSecondEnvelope,
                              double heightSecondEnvelope) {

        double AreaFirstEnvelope = getAreaEnvelope(widthFirstEnvelope, heightFirstEnvelope);
        double AreaSecondEnvelope = getAreaEnvelope(widthSecondEnvelope, heightSecondEnvelope);

        if (AreaFirstEnvelope > AreaSecondEnvelope) {
            /*
            One envelope can fit into another if and only if both the width and height of one envelope
             is greater than the width and height of the other envelope
             */
            int comparisonOne =
                    checkSidesBigEnvelopeWithLittleEnvelope(widthFirstEnvelope, widthSecondEnvelope) ? 1 : 0;
            int comparisonTwo =
                    checkSidesBigEnvelopeWithLittleEnvelope(widthFirstEnvelope, heightSecondEnvelope) ? 1 : 0;
            int comparisonThree =
                    checkSidesBigEnvelopeWithLittleEnvelope(heightFirstEnvelope, heightSecondEnvelope) ? 1 : 0;
            int comparisonFour =
                    checkSidesBigEnvelopeWithLittleEnvelope(heightFirstEnvelope, widthSecondEnvelope) ? 1 : 0;

            int sumComparisons = comparisonOne + comparisonTwo + comparisonThree + comparisonFour;

            if (sumComparisons == 4) {
                return true;
            } else {
                return false;
            }
        } else if ((AreaFirstEnvelope < AreaSecondEnvelope)) {
            int comparisonOne =
                    checkSidesLittleEnvelopeWithBigEnvelope(widthFirstEnvelope, widthSecondEnvelope) ? 1 : 0;
            int comparisonTwo =
                    checkSidesLittleEnvelopeWithBigEnvelope(widthFirstEnvelope, widthSecondEnvelope) ? 1 : 0;
            int comparisonThree =
                    checkSidesLittleEnvelopeWithBigEnvelope(heightFirstEnvelope, heightSecondEnvelope) ? 1 : 0;
            int comparisonFour =
                    checkSidesLittleEnvelopeWithBigEnvelope(heightFirstEnvelope, widthSecondEnvelope) ? 1 : 0;

            int sumComparisons = comparisonOne + comparisonTwo + comparisonThree + comparisonFour;

            if (sumComparisons == 4) {
                return true;
            } else {
                return false;
            }
        }
        return false;    // if AreaFirstEnvelope == AreaSecondEnvelope
    }

    private double getAreaEnvelope(double width, double height) {
        return width * height;
    }

    private boolean checkSidesLittleEnvelopeWithBigEnvelope(double firstSide, double secondSide) {
        if ((firstSide < secondSide)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkSidesBigEnvelopeWithLittleEnvelope(double firstSide, double secondSide) {
        if ((firstSide > secondSide)) {
            return true;
        } else {
            return false;
        }
    }

}
