package Task6;

public class StudentVisitor extends UniversityVisitor{
    private double mark;

    public StudentVisitor(String studentName, int studentId, double studentMark){
        super(studentName, studentId);
        this.mark = studentMark;

    }
    public StudentVisitor(){
        super();
        this.mark = 0.0;

    }





}