package pojos.US03Pojo;

import java.io.Serializable;

public class US03ResponsePojo implements Serializable {
	private US03ObjectPojo object;
	private String message;
	private String httpStatus;

	public US03ResponsePojo() {
	}

	public US03ResponsePojo(US03ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US03ObjectPojo object){
		this.object = object;
	}

	public US03ObjectPojo getObject(){
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
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}