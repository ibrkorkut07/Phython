package pojos.US10Pojo;

import java.io.Serializable;

public class US10_ViceDeanResponsePojo implements Serializable {
	private US10_ViceDean_Response_ObjectPojo object;
	private String message;
	private String httpStatus;

	public void setObject(US10_ViceDean_Response_ObjectPojo object){
		this.object = object;
	}

	public US10_ViceDean_Response_ObjectPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public US10_ViceDeanResponsePojo() {
	}

	public US10_ViceDeanResponsePojo(US10_ViceDean_Response_ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"US10Pojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}