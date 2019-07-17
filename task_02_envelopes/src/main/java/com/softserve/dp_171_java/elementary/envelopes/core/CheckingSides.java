package com.softserve.dp_171_java.elementary.envelopes.core;

public interface CheckingSides {

    /**
     * check one envelope can fit into another
     *
     * @param widthFirstEnvelope   of the first envelope
     * @param heightFirstEnvelope  of the first envelope
     * @param widthSecondEnvelope  of the second envelope
     * @param heightSecondEnvelope of the second envelope
     * @return true if the first envelope fits the second envelope
     */
    boolean checkSides(double widthFirstEnvelope,
                       double heightFirstEnvelope,
                       double widthSecondEnvelope,
                       double heightSecondEnvelope);


}
