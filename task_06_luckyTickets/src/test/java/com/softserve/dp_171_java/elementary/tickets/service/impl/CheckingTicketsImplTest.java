package com.softserve.dp_171_java.elementary.tickets.service.impl;

import com.softserve.dp_171_java.elementary.tickets.service.CheckingTickets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CheckingTicketsImplTest {

    @Test
    public void checkTicketEqualsForMoscowAlgorithmTest() {
        //GIVEN
        List<Integer> integerList = new ArrayList<>();
        integerList.add(000001);
        integerList.add(999999);
        String algorithmsName = "Moscow";
        CheckingTicketsImpl checkingTickets = new CheckingTicketsImpl();
        int expected = 55251;
        //WHEN
        int actual = checkingTickets.checkTicket(integerList, algorithmsName);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void checkTicketEqualsForPiterAlgorithmTest() {
        //GIVEN
        List<Integer> integerList = new ArrayList<>();
        integerList.add(000001);
        integerList.add(999999);
        String algorithmsName = "Piter";
        CheckingTicketsImpl checkingTickets = new CheckingTicketsImpl();
        int expected = 55251;
        //WHEN
        int actual = checkingTickets.checkTicket(integerList, algorithmsName);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void checkTicketEqualsNotCorrectAlgorithmsNameTest() {
        //GIVEN
        List<Integer> integerList = new ArrayList<>();
        integerList.add(000001);
        integerList.add(999999);
        String algorithmsName = "MosKow";
        CheckingTicketsImpl checkingTickets = new CheckingTicketsImpl();
        int expected = 0;
        //WHEN
        int actual = checkingTickets.checkTicket(integerList, algorithmsName);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void checkTicketNotEqualsResultTest() {
        //GIVEN
        List<Integer> integerList = new ArrayList<>();
        integerList.add(000001);
        integerList.add(999999);
        String algorithmsName = "Moscow";
        CheckingTickets checkingTickets = new CheckingTicketsImpl();
        int expected = 1;
        //WHEN
        int actual = checkingTickets.checkTicket(integerList, algorithmsName);
        //THEN
        assertNotEquals(expected, actual);
    }

    @Test
    public void checkTicketNotEqualsNotCorrectAlgorithmsNameTest() {
        //GIVEN
        List<Integer> integerList = new ArrayList<>();
        integerList.add(000001);
        integerList.add(999999);
        String algorithmsName = "MosKow";
        CheckingTicketsImpl checkingTickets = new CheckingTicketsImpl();
        int expected = 55251;
        //WHEN
        int actual = checkingTickets.checkTicket(integerList, algorithmsName);
        //THEN
        assertNotEquals(expected, actual);
    }

}
