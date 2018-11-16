package pl.infoshare.processing._5_json._2_exercise;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JsonExercise {

    // TODO: Exercise - Json
    // TODO: 0. W katalogu paths/json utwórz ręcznie plik test.json i uzupełnij go danymi (też ręcznie):
    // TODO:    - wyświetlenia = 0,
    // TODO:    - tytuł -> Great article
    // TODO:    - tekst -> Lorem ipsum
    // TODO:    - tagi -> sport, world, europe
    // TODO:    - czy jest opublikowany -> true
    // TODO: 1. Stwórz odpowiednią klasę przechowującą podane wyżej dane
    // TODO: 2. Wczytaj Json z pliku
    // TODO: 3. Zamień czysty obiekt jsonowy na stworzoną wcześniej klasę
    // TODO: 4. Wypisz dane na ekran
    // TODO: 5. Zwiększ liczbę wyświetleń o jeden
    // TODO: 6. Zapisz z powrotem do pliku
    public static void main(String[] args) {
        Post post = deserializeFromJson();
        post.incrementViews();
        System.out.println(post);

        serializeToJson(post);
    }

    private static void serializeToJson(Post profile) {
        JSONObject jsonObject = new JSONObject(profile);
        try {
            Files.write(Paths.get("paths", "json", "test.json"), Collections.singletonList(jsonObject.toString()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static Post deserializeFromJson() {
        String jsonString = readFromFile();
        JSONObject jsonObject = new JSONObject(jsonString);

        JSONArray jsonTags = jsonObject.getJSONArray("tags");
        Set<String> tags = new HashSet<>();
        for (int i = 0; i < jsonTags.length(); i++) {
            tags.add(jsonTags.getString(i));
        }

        return new Post(
                jsonObject.getString("title"),
                jsonObject.getString("text"),
                jsonObject.getInt("views"),
                jsonObject.getBoolean("published"),
                tags
        );
    }

    private static String readFromFile() {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("paths", "json", "test.json"));

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
