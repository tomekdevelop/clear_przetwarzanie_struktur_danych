package pl.infoshare.processing._1_strings._1_strings;

import java.util.Scanner;

public class StringExample {

    private static final String UNKNOWN_COMMAND_MESSAGE = "Command %s is unknown.";

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String givenCommand = getInputFromUser();

        if (givenCommand.equalsIgnoreCase("printLine")) {
            System.out.println("I am printing as requested");
        } else if (givenCommand.equalsIgnoreCase("exit")) {
            System.exit(0);
        } else {
            System.out.println(String.format(UNKNOWN_COMMAND_MESSAGE, givenCommand));
        }
    }

    private static String getInputFromUser() {
        System.out.print("Please give me string: ");
        return SCANNER.nextLine().trim();
    }
}
