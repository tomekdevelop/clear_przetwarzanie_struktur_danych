package pl.infoshare.processing._5_json._1_example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonExample {

    public static void main(String[] args) {
        EmployeeProfile profile = deserializeFromJson();
        System.out.println(profile);
        profile.setAge(90);
        serializeToJson(profile);
    }

    private static EmployeeProfile deserializeFromJson() {
        String jsonString = readFromFile();
        JSONObject jsonObject = new JSONObject(jsonString);

        JSONArray jsonCompanies = jsonObject.getJSONArray("companies");
        List<String> companies = new ArrayList<>();
        for (int i = 0; i < jsonCompanies.length(); i++) {
            companies.add(jsonCompanies.getString(i));
        }

        return new EmployeeProfile(
                jsonObject.getString("name"),
                jsonObject.getInt("age"),
                jsonObject.getBoolean("unemployed"),
                companies
        );
    }

    private static void serializeToJson(EmployeeProfile profile) {
        JSONObject jsonObject = new JSONObject(profile);
        try {
            Files.write(Paths.get("paths", "json", "new-example.json"), Collections.singletonList(jsonObject.toString()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static String readFromFile() {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("paths", "json", "example.json"));

            StringBuilder stringBuilder = new StringBuilder();
            for (String line: allLines) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
