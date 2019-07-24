package com.softserve.dp_171_java.elementary.tickets.service.impl;

import com.softserve.dp_171_java.elementary.tickets.service.CheckingTickets;

import java.util.List;

public class CheckingTicketsImpl implements CheckingTickets {

    @Override
    public int checkTicket(List<Integer> listTickets, String checkingAlgorithm) {

        int firstTicket = listTickets.get(0);
        int secondTicket = listTickets.get(1);
        int sum = 0;

        for (int i = firstTicket; i <= secondTicket; i++) {
            int numberFirst = i / 100_000;
            int numberSecond = (i / 10_000) % 10;
            int numberThird = (i / 1_000) % 10;
            int numberFourth = (i / 100) % 10;
            int numberFifth = (i / 10) % 10;
            int numberSixth = i % 10;

            if (checkingAlgorithm.equals("Moscow")) {
                if ((numberFirst + numberSecond + numberThird)
                        == (numberFourth + numberFifth + numberSixth)) {
                    sum++;
                }
            } else if (checkingAlgorithm.equals("Piter")) {
                if ((numberFirst + numberThird + numberFifth)
                        == (numberSecond + numberFourth + numberSixth)) {
                    sum++;
                }
            }
        }
        return sum;
    }

}
