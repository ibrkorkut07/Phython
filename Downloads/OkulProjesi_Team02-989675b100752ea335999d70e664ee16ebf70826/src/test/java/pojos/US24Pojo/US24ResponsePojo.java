package pojos.US24Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US24ResponsePojo implements Serializable {
    private US24ObjectPojo object;
    private String message;
    private String httpStatus;

    public void setObject(US24ObjectPojo object) {
        this.object = object;
    }

    public US24ObjectPojo getObject() {
        return object;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public US24ResponsePojo() {
    }

    public US24ResponsePojo(US24ObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return
                "ResponsePojo{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}