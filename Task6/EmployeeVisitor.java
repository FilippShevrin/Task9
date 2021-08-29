package Task6;

public class EmployeeVisitor extends UniversityVisitor{
    private String workType;
    private static int shtuka = 0;

    public EmployeeVisitor(String EmployeeName, int EmployeeId, String EmployeeWorkType){
        super(EmployeeName,EmployeeId);
        this.workType= EmployeeWorkType;
        shtuka++;

    }
    public EmployeeVisitor(){
        super();
        this.workType = null;

    }

    public static int myGetterEmployeeShtukas(){
        return shtuka;

    }

}