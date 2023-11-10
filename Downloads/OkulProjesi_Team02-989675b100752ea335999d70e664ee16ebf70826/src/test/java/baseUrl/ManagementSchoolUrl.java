package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.Authentication;
import utilities.ConfigReader;


public class ManagementSchoolUrl extends Authentication {

    public static RequestSpecification spec;

    public static void adminSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("adminPassword"))).
                setBaseUri("https://managementonschools.com/app").build();
    } //setContentType() kismi post isleminin duzgun calismasi icin

    public static void deanSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("deanUsername"), ConfigReader.getProperty("deanPassword"))).
                setBaseUri("https://managementonschools.com/app").build();
    }

    public static void viceDeanSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("viceDeanUsername"), ConfigReader.getProperty("viceDeanPassword"))).
                setBaseUri("https://managementonschools.com/app").build();
    }

    public static void teacherSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("teacherUsername"), ConfigReader.getProperty("teacherPassword"))).
                setBaseUri("https://managementonschools.com/app").build();
    }

    public static void studentSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("studentPassword"), ConfigReader.getProperty("studentUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    }
}

