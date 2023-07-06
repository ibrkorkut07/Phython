package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ObjectMapperUtils {

    public static <T> T convertJsonToJava(String json, Class<T> c) {
        try {
            return new ObjectMapper().readValue(json, c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
