package com.softserve.dp_171_java.elementary.fibonacci.controller;

import com.softserve.dp_171_java.elementary.fibonacci.interaction.InputView;
import com.softserve.dp_171_java.elementary.fibonacci.interaction.OutputView;
import com.softserve.dp_171_java.elementary.fibonacci.service.WorkingWithDigitForFibonacciSeries;

import java.util.List;

public class AppController {

    private InputView inputView = new InputView();
    private WorkingWithDigitForFibonacciSeries workingWithDigitForFibonacciSeries = new WorkingWithDigitForFibonacciSeries();
    private OutputView outputView = new OutputView();

    public void runApp() {

        while (true) {
            inputView.greeting();
            inputView.askingDigit();
            int digitFirst = inputView.getDigitForWorkFirst();
            int digitSecond = inputView.getDigitForWorkSecond();
            if (digitSecond == 0) {
                List<String> resultForSpecifiedLength =
                        workingWithDigitForFibonacciSeries.fibonacciForSpecifiedLength(digitFirst);
                outputView.answerToTheTask(resultForSpecifiedLength);
                resultForSpecifiedLength.clear();
            } else {
                List<String> resultForSpecifiedRange =
                        workingWithDigitForFibonacciSeries.fibonacciForSpecifiedRange(digitFirst, digitSecond);
                outputView.answerToTheTask(resultForSpecifiedRange);
                resultForSpecifiedRange.clear();
            }
            if (outputView.comeOutOrNot()) {
                break;
            }
        }

    }

}