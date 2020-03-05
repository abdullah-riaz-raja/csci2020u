package sample;

public class StudentRecord {

    private String id;
    private float midterm;
    private float assignments;
    private float exam;
    private float mark;
    private String grade;

    public StudentRecord() {
        this.id = "";
        this.midterm = 0f;
        this.assignments = 0f;
        this.exam = 0f;
        this.mark = 0f;
        this.grade = "N/A";
    }

    //public StudentRecord(String id, float assignments, float midterm, float exam)
    public StudentRecord(String id, float assignments, float midterm, float exam) {
        this.id = id;
        this.midterm = midterm;
        this.assignments = assignments;
        this.exam = exam;
        this.mark = (assignments/100) * 20 + (midterm/100) * 30 + (exam/100) * 50;

        if (mark > 80) {
            this.grade = "A";
        } else if (mark > 70) {
            this.grade = "B";
        } else if (mark > 60) {
            this.grade = "C";
        } else if (mark > 50) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getMidterm() {
        return midterm;
    }

    public void setMidterm(float midterm) {
        this.midterm = midterm;
    }

    public float getAssignments() {
        return assignments;
    }

    public void setAssignments(float assignments) {
        this.assignments = assignments;
    }

    public float getExam() {
        return exam;
    }

    public void setExam(float exam) {
        this.exam = exam;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
