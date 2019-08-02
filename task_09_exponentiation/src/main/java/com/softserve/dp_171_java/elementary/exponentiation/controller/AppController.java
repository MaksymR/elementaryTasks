package com.softserve.dp_171_java.elementary.exponentiation.controller;

import com.softserve.dp_171_java.elementary.exponentiation.interaction.InputView;
import com.softserve.dp_171_java.elementary.exponentiation.interaction.OutputView;
import com.softserve.dp_171_java.elementary.exponentiation.service.WorkingWithBaseAndExponent;

public class AppController {

    private Double number;
    private Integer exponent;

    private InputView inputView = new InputView();
    private WorkingWithBaseAndExponent workingWithBaseAndExponent = new WorkingWithBaseAndExponent();
    private OutputView outputView = new OutputView();

    public void runApp() {

        while (true) {
            inputView.greeting();
            inputView.askingNumberAndExponent();
            number = inputView.getNumberForWork();
            exponent = inputView.getExponentForWork();
            if ((number != null) && (exponent != null)) {
                double result = workingWithBaseAndExponent.pow(number, exponent);
                outputView.answerToTheTask(result);
            }
            number = null;
            exponent = null;
            if (outputView.comeOutOrNot()) {
                break;
            }
        }

    }

}
