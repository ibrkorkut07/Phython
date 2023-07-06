package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateAdminToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", ConfigReader.getProperty("adminPassword"));
        token.put("username", ConfigReader.getProperty("adminUsername"));
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateDeanToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", ConfigReader.getProperty("deanPassword"));
        token.put("username", ConfigReader.getProperty("deanUsername"));
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateViceDeanToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", ConfigReader.getProperty("viceDeanPassword"));
        token.put("username", ConfigReader.getProperty("viceDeanUsername"));
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateTeacherToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", ConfigReader.getProperty("teacherPassword"));
        token.put("username", ConfigReader.getProperty("teacherUsername"));
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

    public static String generateStudentToken() {
        Map<String, String> token = new HashMap<>();
        token.put("password", ConfigReader.getProperty("studentPassword"));
        token.put("username", ConfigReader.getProperty("studentUsername"));
        Response response = given().contentType(ContentType.JSON).body(token).post(ConfigReader.getProperty("authentication"));
        return response.jsonPath().getString("token");
    }

}
