package pl.infoshare.processing._4_properties._1_example;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) {
        SimpleExampleProperties simpleProperties = loadProperties();
        System.out.println("Version: " + simpleProperties.getVersion());
        System.out.println("Application: " + simpleProperties.getName());
    }

    private static SimpleExampleProperties loadProperties() {
        try(InputStream resourceAsStream = PropertiesExample.class.getResourceAsStream("application.properties")) {
            Properties properties = new Properties();
            properties.load(resourceAsStream);

            return new SimpleExampleProperties(properties);

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
