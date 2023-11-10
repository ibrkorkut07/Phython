package pojos.US08Pojo;

import java.io.Serializable;

public class ObjectPojo implements Serializable {
	private int lessonId;
	private String lessonName;
	private int creditScore;
	private String compulsory;

	public ObjectPojo() {//
	}


	public ObjectPojo(int lessonId, String lessonName, int creditScore, String compulsory) {
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.creditScore = creditScore;
		this.compulsory= compulsory;
	}

	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setCompulsory(String compulsory){
		this.compulsory = compulsory;
	}

	public String getCompulsory(){
		return compulsory;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",compulsory = '" + compulsory + '\'' + 
			"}";
		}
}