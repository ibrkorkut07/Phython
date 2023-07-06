package pojos;

import java.util.ArrayList;

public class LessonProgramIdPojo {

    private ArrayList<Integer> lessonProgramId;

    public LessonProgramIdPojo() {
    }

    public LessonProgramIdPojo(ArrayList<Integer> lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }

    public ArrayList<Integer> getLessonProgramId() {
        return lessonProgramId;
    }

    public void setLessonProgramId(ArrayList<Integer> lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }

    @Override
    public String toString() {
        return "LessonProgramIdPojo{" +
                "lessonProgramId=" + lessonProgramId +
                '}';
    }

}
