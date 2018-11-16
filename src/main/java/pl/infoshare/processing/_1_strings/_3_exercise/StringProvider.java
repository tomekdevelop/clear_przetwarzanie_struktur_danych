package pl.infoshare.processing._1_strings._3_exercise;

import java.util.Arrays;
import java.util.List;

public class StringProvider {

    public List<String> getTestStrings() {
        return Arrays.asList(
                "ABC123JO",
                "ABCKJSHDBF123JO",
                "A123JO",
                "ABC12JO",
                "ABC1JO",
                "ABCJO",
                "abc123JO",
                "ABC123J0",
                "ABC1234JO",
                "ABCdsa1234JO",
                "dsaABC1234JO",
                "JO",
                "123JO",
                "1232JO",
                "123J0",
                "AbC123JO",
                "ABc123JO",
                "         ABC123JO",
                "ABC123JO       ",
                "    ABC123JO     ",
                "ABC123JO\t",
                "\tABC123JO\t",
                "ABC 123JO",
                "AB^123JO"
        );
    }
}
