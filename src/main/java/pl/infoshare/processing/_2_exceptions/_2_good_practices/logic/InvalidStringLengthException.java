package pl.infoshare.processing._2_exceptions._2_good_practices.logic;

public class InvalidStringLengthException extends Exception {

    private final String invalidString;
    private final int requiredLength;

    public InvalidStringLengthException(String invalidString, int requiredLength) {
        super(String.format("String %s should have at least %s characters.", invalidString, requiredLength));
        this.invalidString = invalidString;
        this.requiredLength = requiredLength;
    }

    public String getInvalidString() {
        return invalidString;
    }

    public int getRequiredLength() {
        return requiredLength;
    }
}
