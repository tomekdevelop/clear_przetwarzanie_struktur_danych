package pl.infoshare.processing._4_properties._1_example;

import java.util.Properties;

public class SimpleExampleProperties {

    private final Properties properties;

    public SimpleExampleProperties(Properties properties) {
        this.properties = properties;
    }

    public String getVersion() {
        return properties.getProperty("version");
    }

    public String getName() {
        return properties.getProperty("name");
    }
}
