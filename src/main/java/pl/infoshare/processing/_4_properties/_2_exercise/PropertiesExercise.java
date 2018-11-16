package pl.infoshare.processing._4_properties._2_exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Properties;

public class PropertiesExercise {

    // TODO: Exercise - Properties
    // TODO: Wczytaj konfigurację a następnie na jej podstawie sprawdź czy hasło jest poprawne.
    // TODO: Jeżeli jest poprawny wypisz string.correct.message jeżeli - string.incorrect.message
    public static void main(String[] args) {
        String givenPassword = "Password123";

        SimpleExerciseProperties properties = loadProperties();
        if (givenPassword.matches(properties.getValidationRule())) {
            System.out.println(properties.getCorrectMessage());
        } else {
            System.out.println(properties.getIncorrectMessage());
        }
    }

    private static SimpleExerciseProperties loadProperties() {
        try(InputStream resourceAsStream = PropertiesExercise.class.getResourceAsStream("application.properties")) {
            Properties properties = new Properties();
            properties.load(resourceAsStream);

            return new SimpleExerciseProperties(properties);

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
