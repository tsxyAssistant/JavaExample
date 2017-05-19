package Test;

import SchoolJson.School;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by bllli on 17-5-19.
 */
public class SchoolJsonTester {
    public static void run() throws IOException {
        try (Reader reader = new InputStreamReader(School.class.getResourceAsStream("/school.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            School aSchool = gson.fromJson(reader, School.class);
            System.out.println(aSchool);
        }
    }

}
