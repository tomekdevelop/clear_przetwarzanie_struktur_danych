package pl.infoshare.processing._3_files._2_exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesExercise {

    // TODO: Ćwiczenie - Files:
    // TODO: 1. Stwórz plik tymczasowy, zapisz do niego pierwszą część lorem ipsum pobraną z LoremProvider
    // TODO: 2. Skopiuj plik do projektu do folderu paths/custom. Nazwa pliku: lorem.txt
    // TODO: 4. Usuń plik tymczasowy
    // TODO: 5. Sprawdź i wypisz informację o tym czy plik tymczasowy istnieje
    // TODO: 6. Odczytaj zawartość pliku lorem.txt i wypisz zawartość na ekran
    // TODO: 7. Dopisz do pliku lorem.txt drugą część lorem ipsum
    // TODO: 8. Odczytaj zawartość pliku lorem.txt, wypisz linijki 3, 6, 8 na ekran
    public static void main(String[] args) throws IOException {
        LoremProvider loremProvider = new LoremProvider();

        Path tempLoremFilePath = Files.createTempFile("lorem", ".txt");
        Files.write(tempLoremFilePath, loremProvider.getFirstPartOfLorem());

        Path customDir = Paths.get("paths", "custom");

        Files.createDirectory(customDir);
        Path loremFilePath = customDir.resolve("lorem.txt");
        Files.copy(tempLoremFilePath, loremFilePath);
        Files.delete(tempLoremFilePath);
        System.out.println("Temp file exists: " + Files.exists(tempLoremFilePath));

        List<String> loremFileContent = Files.readAllLines(loremFilePath);
        System.out.println(loremFileContent);

        Files.write(loremFilePath, loremProvider.getSecondPartOfLorem(), StandardOpenOption.APPEND);
        List<String> wholeLorem = Files.readAllLines(loremFilePath);
        System.out.println(wholeLorem.get(2));
        System.out.println(wholeLorem.get(5));
        System.out.println(wholeLorem.get(7));
    }
}
