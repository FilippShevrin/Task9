package Task6;


import java.util.ArrayList;

public class Arhiv {
    private ArrayList <StudentVisitor> StudentsArrayList;
    private ArrayList<EmployeeVisitor> EmployeesArrayList;

    Arhiv(){
         StudentsArrayList  = new ArrayList<StudentVisitor>();
         EmployeesArrayList = new ArrayList<EmployeeVisitor>();

    }

    public void addStudent (StudentVisitor s1){
        StudentsArrayList.add(s1);

    }


    public void addEmployees (EmployeeVisitor e1){
        EmployeesArrayList.add(e1);
    }



    public void ShowStudents (){
        System.out.println(StudentsArrayList);
    }
    public  void ShowEmployess (){
        System.out.println(EmployeesArrayList);
    }

}
