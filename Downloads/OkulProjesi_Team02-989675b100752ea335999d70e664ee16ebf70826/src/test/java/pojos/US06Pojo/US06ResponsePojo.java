package pojos.US06Pojo;

import java.io.Serializable;

public class US06ResponsePojo implements Serializable {
	private US06ObjectPojo object;
	private String message;
	private String httpStatus;

	public US06ResponsePojo() {
	}

	public US06ResponsePojo(US06ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US06ObjectPojo object){
		this.object = object;
	}

	public US06ObjectPojo getObject(){
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