package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentMeetPojo {

    private int id;
    private String description;
    private String date;
    private String startTime;
    private String stopTime;
    private int advisorTeacherId;
    private String teacherName;
    private String teacherSsn;

    public StudentMeetPojo() {
    }

    public StudentMeetPojo(int id, String description, String date, String startTime, String stopTime, int advisorTeacherId, String teacherName, String teacherSsn) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.advisorTeacherId = advisorTeacherId;
        this.teacherName = teacherName;
        this.teacherSsn = teacherSsn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public int getAdvisorTeacherId() {
        return advisorTeacherId;
    }

    public void setAdvisorTeacherId(int advisorTeacherId) {
        this.advisorTeacherId = advisorTeacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSsn() {
        return teacherSsn;
    }

    public void setTeacherSsn(String teacherSsn) {
        this.teacherSsn = teacherSsn;
    }

    @Override
    public String toString() {
        return "StudentMeetPojo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", advisorTeacherId=" + advisorTeacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSsn='" + teacherSsn + '\'' +
                '}';
    }

}
