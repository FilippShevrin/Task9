package Task6;

public class Main {

    public static void main (String[] args){

       Arhiv centArhiv = new Arhiv();
       StudentVisitor SV = new StudentVisitor("petr",1,4.1);

       centArhiv.addStudent(SV);

       SV.myGetterName();

       EmployeeVisitor EV = new EmployeeVisitor("Anton",2,"Shvabra");
       centArhiv.addEmployees(EV);

       EV.myGetterName();
       System.out.println(EmployeeVisitor.myGetterEmployeeShtukas());


    }
}

//
//
////Задание 6.2 - Помогаем бюрократам.
////К вам обратился декан одного из факультетов - он вечно теряет список своих студентов,
//// и хочет разработать программу, позволяющую ему хранить эти данные.
////Тут же к вам подошла руководитель отдела кадров - ей тоже необходимо вести список
//// работников университета, и продолжать это делать на бумажках она не желает.
////
////Разрешите все беды документооборота и создайте необходимую иерархию классов:
////
////Student extends UniversityVisitor
////Employee extends UniversityVisitor
////
////Каждому классу задайте несколько нестатических полей и методов.
////
////Создайте класс-архив для хранения информации о всех посетителях университета(и студентов
//// и персонала университета) (используем ArrayList)
////Реализуйте у класс архива методы, позволяющие выводить:
////-студентов
////-преподавателей
////-всех посетителей, у кого имя = переданному в аргумент метода параметру