package com.softserve.dp_171_java.elementary.fileParser.console;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkWithFile {

    private static final String PATH_TO_FILE_FOR_READING =
            "task_04_fileParser/src/main/resources/alice_in_wonderland.txt";
    private static final String PATH_TO_FILE_FOR_WRITING =
            "task_04_fileParser/src/main/resources/example.txt";

    public void workWithFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_TO_FILE_FOR_READING));
            String line = bufferedReader.readLine();
            List<String> listWords = new ArrayList<>();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_TO_FILE_FOR_WRITING));

            txtFileToStringArray(bufferedReader, line, listWords);

            while (true) {

                outputTextForActions();

                BufferedReader bufferedReaderFromConsole = new BufferedReader(new InputStreamReader(System.in));
                String wordForCounting = bufferedReaderFromConsole.readLine();

                String[] arrayWordForCounting = wordForCounting.split("\\s*(\\s)\\s*");
                if (arrayWordForCounting.length == 1) {
                    if (arrayWordForCounting[0].equals("")) {
                        System.out.println("Enter a word or words according to the format as above, please!");
                        continue;
                    }
                    countingOfWord(listWords, wordForCounting);
                } else if (arrayWordForCounting.length == 2) {
                    replaceWordsAndWriteToFile(bufferedWriter, arrayWordForCounting);
                } else if (arrayWordForCounting.length > 2) {
                    System.out.println("It was inputted a lot parameters. (look at the format above, please)." +
                            " Try again, please");
                }

                if (exitAndFinishWorkingWithFile(bufferedReader, bufferedReaderFromConsole, bufferedWriter)) {
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("A file doesn't exist");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void txtFileToStringArray(BufferedReader bufferedReader, String line, List<String> listWords) throws IOException {
        while (line != null) {
            System.out.println(line);
            String[] textWords = line.split("([.,!?():;'\"-]|\\s)+");
            for (String s : textWords) {
                listWords.add(s);
            }
            line = bufferedReader.readLine();
        }
    }

    private void outputTextForActions() {
        System.out.println("\nEnter a word for counting in next format:");
        System.out.println("<a word for the count>");
        System.out.println("or a word for replace in next format:");
        System.out.println(" <a word from text> <a word for replace>");
    }

    private void countingOfWord(List<String> listWords, String wordForCounting) {
        long count = listWords.stream().filter(w -> w.equals(wordForCounting)).count();
        System.out.println(count);
    }

    private void replaceWordsAndWriteToFile(BufferedWriter bufferedWriter, String[] arrayWordForCounting) throws IOException {
        BufferedReader bufferedReaderForWriting = new BufferedReader(new FileReader(PATH_TO_FILE_FOR_READING));
        String lineForReplace = bufferedReaderForWriting.readLine();
        while (lineForReplace != null) {
            String newLineAfterReplace =
                    lineForReplace.replaceAll(arrayWordForCounting[0], arrayWordForCounting[1]);
            String tempLineForWriting = newLineAfterReplace + "\r";
            System.out.println(tempLineForWriting);
            bufferedWriter.write(tempLineForWriting);
            lineForReplace = bufferedReaderForWriting.readLine();
        }
    }

    private boolean exitAndFinishWorkingWithFile(BufferedReader bufferedReader,
                                                 BufferedReader bufferedReaderFromConsole,
                                                 BufferedWriter bufferedWriter) throws IOException {
        System.out.println("\nDo you want to continue?");
        System.out.println("Enter please \"y\" or \"yes\" (you can ignore character case).");
        System.out.println("If you want to exit then type another else, please.");

        String exitOrNo = bufferedReaderFromConsole.readLine();
        boolean exitY = exitOrNo.equalsIgnoreCase("y");
        boolean exitYes = exitOrNo.equalsIgnoreCase("yes");
        if ((!exitY) && (!exitYes)) {
            bufferedReader.close();
            bufferedReaderFromConsole.close();
            bufferedWriter.close();
            return true;
        }
        return false;
    }

}