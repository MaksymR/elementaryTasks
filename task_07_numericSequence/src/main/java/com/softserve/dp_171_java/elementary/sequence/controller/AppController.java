package com.softserve.dp_171_java.elementary.sequence.controller;

import com.softserve.dp_171_java.elementary.sequence.interaction.InputView;
import com.softserve.dp_171_java.elementary.sequence.interaction.OutputView;
import com.softserve.dp_171_java.elementary.sequence.service.WorkingWithDigit;

import java.util.Map;

public class AppController {

    private InputView inputView = new InputView();
    private WorkingWithDigit workingWithDigit = new WorkingWithDigit();
    private OutputView outputView = new OutputView();

    public void runApp() {

        while (true) {
            inputView.greeting();
            inputView.askingDigit();
            int digit = inputView.getDigitForWork();
            Map<Integer, Integer> result = workingWithDigit.workWithDigit(digit);
            outputView.answerToTheTask(result);
            if (outputView.comeOutOrNot()) {
                break;
            }
        }

    }

}
