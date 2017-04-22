package beans;

public class Subject {

    private int SubjectId;
    private String SubjectName;

    //public beans.Course CourseInfo = new Course() ;
    
    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int SubjectId) {
        this.SubjectId = SubjectId;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }
    
}
