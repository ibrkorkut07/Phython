package pojos;

public class LessonObjectPojo {

    private boolean compulsory;
    private int creditScore;
    private String lessonName;

    public LessonObjectPojo() {
    }

    public LessonObjectPojo(boolean compulsory, Integer creditScore, String lessonName) {
        this.compulsory = compulsory;
        this.creditScore = creditScore;
        this.lessonName = lessonName;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "LessonObjectPojo{" +
                "compulsory=" + compulsory +
                ", creditScore=" + creditScore +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }

}
