package pl.infoshare.processing._3_files._2_try;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TryExample {

    public static void main(String[] args) throws IOException {
        readLinesFromFile();
    }

    private static List<String> readLinesFromFile() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("paths/data/example.txt"))) {
            List<String> lines = new ArrayList<>();
            String currentLine = bufferedReader.readLine();

            do {
                lines.add(currentLine);
                currentLine = bufferedReader.readLine();
            } while(currentLine != null);

            return lines;
        }
    }
}
