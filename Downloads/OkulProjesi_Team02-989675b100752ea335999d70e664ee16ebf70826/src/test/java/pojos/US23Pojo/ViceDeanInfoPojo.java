package pojos.US23Pojo;

import java.io.Serializable;

public class ViceDeanInfoPojo implements Serializable {
	private ObjectPojo object;
	private String message;
	private String httpStatus;

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
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

	public ViceDeanInfoPojo() {
	}

	public ViceDeanInfoPojo(ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ViceDeanInfoPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}