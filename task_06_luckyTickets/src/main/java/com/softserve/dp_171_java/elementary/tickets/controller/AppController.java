package com.softserve.dp_171_java.elementary.tickets.controller;

import com.softserve.dp_171_java.elementary.tickets.interaction.InputView;
import com.softserve.dp_171_java.elementary.tickets.interaction.OutputView;
import com.softserve.dp_171_java.elementary.tickets.service.impl.CheckingTicketsImpl;

import java.util.List;

public class AppController {

    private InputView inputView = new InputView();
    private CheckingTicketsImpl checkingTicketsImpl = new CheckingTicketsImpl();
    private OutputView outputView = new OutputView();

    public void runApp() {

        while (true) {
            inputView.greeting();
            inputView.askingTickets();
            List<Integer> ticketsList = inputView.getTicketsList();
            String checkingAlgorithm = inputView.askingCheckingAlgorithm();
            int result = checkingTicketsImpl.checkTicket(ticketsList, checkingAlgorithm);
            outputView.answerToTheTask(result);
            if (outputView.comeOutOrNot()) {
                break;
            }
        }

    }

}
