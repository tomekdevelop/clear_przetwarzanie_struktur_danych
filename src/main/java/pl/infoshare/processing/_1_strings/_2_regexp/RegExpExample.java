package pl.infoshare.processing._1_strings._2_regexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RegExpExample {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final String example = "Maciej|koziara";

    // TODO: Example:
    // TODO: Przeprowadzić walidację stringa example. String powinien:
    // TODO: * zaczynać się na literę M
    // TODO: * kończyć na ara
    // TODO: * w środku posiadać tylko małe litery i znaki |
    public static void main(String[] args) {
        if (example.matches("^M[a-z|]*ara$")) {
            System.out.println("Matches");
        }

        String userSearch = getInputFromUser();

        List<String> foundStrings = new ArrayList<>();
        List<String> stringsToSearch = getStringsToSearch();
        for (String toSearch: stringsToSearch) {
            if (toSearch.matches(".*" + userSearch + ".*")) {
                foundStrings.add(toSearch);
            }
        }

        System.out.println(foundStrings);
    }

    private static String getInputFromUser() {
        System.out.print("Please give me string: ");
        return SCANNER.nextLine();
    }

    private static List<String> getStringsToSearch() {
        return Arrays.asList(
                "Afghanistan",
                "Albania",
                "Algeria",
                "Andorra",
                "Angola",
                "Antigua and Barbuda",
                "Argentina",
                "Armenia",
                "Aruba",
                "Australia",
                "Austria",
                "Azerbaijan",
                "Denmark",
                "Djibouti",
                "Dominica"
        );
    }
}