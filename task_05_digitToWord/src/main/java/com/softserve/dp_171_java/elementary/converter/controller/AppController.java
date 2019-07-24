package com.softserve.dp_171_java.elementary.converter.controller;

import com.softserve.dp_171_java.elementary.converter.service.DigitToWord;
import com.softserve.dp_171_java.elementary.converter.view.InputView;
import com.softserve.dp_171_java.elementary.converter.view.OutputView;

public class AppController {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private DigitToWord digitToWord = new DigitToWord();

    public void runApp() {

        while (true) {
            inputView.greeting();
            int digitFromConsole = inputView.askingDigitsNames();
            String result = digitToWord.convert(digitFromConsole);
            outputView.answerToTheTask(digitFromConsole, result);
            if (outputView.comeOutOrNot()) {
                break;
            }
        }

    }

}
