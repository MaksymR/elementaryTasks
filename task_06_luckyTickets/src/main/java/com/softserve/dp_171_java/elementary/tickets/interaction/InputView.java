package com.softserve.dp_171_java.elementary.tickets.interaction;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    private List<Integer> ticketsList = new ArrayList<>();

    public void greeting() {

        System.out.println("\nYou can input a ticket and" +
                " I try to say that it is a lucky ticket or not)");

    }

    public void askingTickets() {

        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("So, input a path to tickets (please use for this example next path: " +
                    "task_06_luckyTickets/src/main/resources/lucky_tickets.txt ):\n");
            try {
                String pathToTickets = bufferedReader.readLine();
                readFromFile(ticketsList, pathToTickets);
                if (!ticketsList.isEmpty()) {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("You have inputted another symbol but not the digit." +
                        " Try again, please");
            } catch (FileNotFoundException ex) {
                System.out.println("\nCheck the file's path and enter the correct one, please.\n");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

    public List<Integer> getTicketsList() {
        return ticketsList;
    }

    public String askingCheckingAlgorithm() {

        String algorithm = "";
        while (true) {
            BufferedReader bufferedReaderAlgorithm = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nChoose the algorithm \"Moscow\" or \"Piter\" and enter it:");
            try {
                algorithm = bufferedReaderAlgorithm.readLine();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            if ((algorithm.equals("Moscow")) | (algorithm.equals("Piter"))) {
                break;
            } else if ((algorithm.equalsIgnoreCase("exit"))) {
                break;
            } else {
                System.out.println("If you want to exit then enter \"exit\" to exit" +
                        " or try again, please.");
            }
        }
        return algorithm;
    }

    private void readFromFile(List<Integer> ticketsList, String pathToTickets) throws IOException {
        BufferedReader bufferedReaderFromFile = new BufferedReader(new FileReader(pathToTickets));
        String ticketsInFile = bufferedReaderFromFile.readLine();
        while (ticketsInFile != null) {
            System.out.println("\n" + ticketsInFile);
            String[] tickets = ticketsInFile.split("\\s*(\\s)\\s*");
            for (String ticket : tickets) {
                int tempTicket = Integer.parseInt(ticket);
                ticketsList.add(tempTicket);
            }
            ticketsInFile = bufferedReaderFromFile.readLine();
        }
    }

}
