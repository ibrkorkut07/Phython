package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseURL {

    public static RequestSpecification spec;
    public static Response response;

    public static void setupBeforeAPI() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri(ConfigReader.getProperty("uri")).
                build();
    }

}
