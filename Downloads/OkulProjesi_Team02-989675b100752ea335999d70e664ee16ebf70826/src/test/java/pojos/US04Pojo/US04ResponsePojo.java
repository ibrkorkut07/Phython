package pojos.US04Pojo;

import java.io.Serializable;

public class US04ResponsePojo implements Serializable {
	private US04ObjectPojo object;
	private String message;
	private String httpStatus;

	public US04ResponsePojo() {
	}

	public US04ResponsePojo(US04ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US04ObjectPojo object){
		this.object = object;
	}

	public US04ObjectPojo getObject(){
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

	@Override
 	public String toString(){
		return 
			"Responsepojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}