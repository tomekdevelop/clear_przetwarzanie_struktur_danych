package pl.infoshare.processing._2_exceptions._2_good_practices;

import pl.infoshare.processing._2_exceptions._2_good_practices.logic.InvalidStringLengthException;
import pl.infoshare.processing._2_exceptions._2_good_practices.logic.StringExtractor;
import pl.infoshare.processing._2_exceptions._2_good_practices.logic.ThrowingStringExtractor;

public class GoodPracticesExample {

    public static void main(String[] args) {
//        invalidLogicHandling("LongString");
//        invalidLogicHandling("abc");

        ignoringExceptions("abc");
    }

    private static void invalidLogicHandling(String stringToExtract) {
        if (stringToExtract.length() < 5) {
            System.out.println(String.format("There is no fifth letter in string %s", stringToExtract));
            return;
        }

        StringExtractor stringExtractor = new StringExtractor();
        char c = stringExtractor.extractFifthLetter(stringToExtract);
        System.out.println(String.format("Fifth letter of string %s is %s", stringToExtract, c));
    }

    private static void ignoringExceptions(String stringToExtract) {
        ThrowingStringExtractor throwingStringExtractor = new ThrowingStringExtractor();

        try {
            char c = throwingStringExtractor.extractOrThrow(stringToExtract);
            System.out.println(String.format("Fifth letter of string %s is %s", stringToExtract, c));
        } catch (InvalidStringLengthException ex) {
            ex.printStackTrace();
        }
    }
}