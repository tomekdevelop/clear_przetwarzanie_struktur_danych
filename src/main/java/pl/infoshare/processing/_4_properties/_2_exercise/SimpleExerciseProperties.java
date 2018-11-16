package pl.infoshare.processing._4_properties._2_exercise;

import java.util.Properties;

public class SimpleExerciseProperties {

    private final Properties properties;

    public SimpleExerciseProperties(Properties properties) {
        this.properties = properties;
    }

    public String getValidationRule() {
        return properties.getProperty("validation.rule");
    }

    public String getCorrectMessage() {
        return properties.getProperty("string.correct.message");
    }

    public String getIncorrectMessage() {
        return properties.getProperty("string.incorrect.message");
    }



}
