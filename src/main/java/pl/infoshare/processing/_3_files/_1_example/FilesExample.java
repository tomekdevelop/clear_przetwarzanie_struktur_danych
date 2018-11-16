package pl.infoshare.processing._3_files._1_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {

    public static void main(String[] args) throws IOException {
        // old way
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("paths/data/example.txt"));
//        List<String> lines = new ArrayList<>();
//        String currentLine = bufferedReader.readLine();
//
//        do {
//            lines.add(currentLine);
//            currentLine = bufferedReader.readLine();
//        } while(currentLine != null);

        // new better way
        Path originalFile = Paths.get("paths", "data", "example.txt");
        List<String> lines = Files.readAllLines(originalFile);
        System.out.println(lines);

        Path dirPath = originalFile.getParent();
        if (dirPath.isAbsolute()) {
            System.out.println("Path is absolute");
        } else {
            System.out.println("Path is not absoulute");
        }

        Path newFilePath = dirPath.resolve("new.txt");
        Files.copy(originalFile, newFilePath);

        Path emptyFile = dirPath.resolve("empty.txt");
        Files.createFile(emptyFile);

        List<String> songLines = Files.readAllLines(newFilePath);
        songLines.remove(0);
        Files.write(emptyFile, songLines);

        Path tempFile = Files.createTempFile("Infoshare", ".txt");
        System.out.println(tempFile);
    }
}
