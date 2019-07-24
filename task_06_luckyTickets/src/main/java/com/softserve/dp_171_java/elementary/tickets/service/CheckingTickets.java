package com.softserve.dp_171_java.elementary.tickets.service;

import java.util.List;

public interface CheckingTickets {

    /**
     * check the ticket through the "Moscow" or "Piter" algorithm
     *
     * @param listTickets       for the checking
     * @param checkingAlgorithm is used for the checking
     * @return a number of lucky combinations
     */
    int checkTicket(List<Integer> listTickets, String checkingAlgorithm);

}
