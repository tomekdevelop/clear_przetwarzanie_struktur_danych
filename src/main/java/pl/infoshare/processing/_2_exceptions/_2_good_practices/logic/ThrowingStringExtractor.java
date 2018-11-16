package pl.infoshare.processing._2_exceptions._2_good_practices.logic;

public class ThrowingStringExtractor {

    public static final int REQUIRED_STRING_LENGTH = 5;

    public char extractOrThrow(String string) throws InvalidStringLengthException {
        if (string.length() < REQUIRED_STRING_LENGTH) {
            throw new InvalidStringLengthException(string, REQUIRED_STRING_LENGTH);
        }

        return string.charAt(REQUIRED_STRING_LENGTH);
    }
}
