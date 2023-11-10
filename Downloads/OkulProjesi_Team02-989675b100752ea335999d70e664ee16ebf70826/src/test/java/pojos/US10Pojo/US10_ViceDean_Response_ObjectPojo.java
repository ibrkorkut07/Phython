package pojos.US10Pojo;

import java.util.List;
import java.io.Serializable;

public class US10_ViceDean_Response_ObjectPojo implements Serializable {
	private int lessonProgramId;
	private String startTime;
	private String stopTime;
	private List<US10_ViceDean_Response_LessonNamePojo> lessonName;
	private String day;

	public void setLessonProgramId(int lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public int getLessonProgramId(){
		return lessonProgramId;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	public void setLessonName(List<US10_ViceDean_Response_LessonNamePojo> lessonName){
		this.lessonName = lessonName;
	}

	public List<US10_ViceDean_Response_LessonNamePojo> getLessonName(){
		return lessonName;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public US10_ViceDean_Response_ObjectPojo() {
	}

	public US10_ViceDean_Response_ObjectPojo(int lessonProgramId, String startTime, String stopTime, List<US10_ViceDean_Response_LessonNamePojo> lessonName, String day) {
		this.lessonProgramId = lessonProgramId;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lessonName = lessonName;
		this.day = day;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}