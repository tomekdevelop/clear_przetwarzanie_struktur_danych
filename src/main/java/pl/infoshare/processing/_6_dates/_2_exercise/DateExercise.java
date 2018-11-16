package pl.infoshare.processing._6_dates._2_exercise;

import java.util.Scanner;

public class DateExercise {

    private static final Scanner SCANNER = new Scanner(System.in);

    // TODO: Exercise - Java 8 dates
    // TODO: Napisz prostą aplikację która będzie przyjmować od użytkownika w formacie 31-12-1900 datę oraz liczbę dni jaka do daty dodać
    // TODO: Następnie po dodaniu sprawdzi jaki jest to miesiąc, czy jest to weekend oraz czy rok jest przestępny
    // TODO: Wypisz informację ile tygodni jest pomiędzy datami
    // TODO: Na sam koniec wypisze obliczoną datę w formacie 1900-31-Dec
    public static void main(String[] args) {
    }

    private static String getInputFromUser() {
        System.out.print("Please give me string: ");
        return SCANNER.nextLine();
    }
}
