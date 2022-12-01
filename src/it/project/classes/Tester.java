package it.project.classes;

public class Tester {

    public static void main(String[] args){

        Student Franco, Gianluca;
        Franco = new Student("Franco");
        Gianluca = new Student("Gianluca");

        Teacher Paolo = new Teacher();
        Paolo.teacherName = "Paolo";

        Paolo.assignGrade(Franco, 28);
        Paolo.assignGrade(Gianluca, 24);

        Franco.getStudentDetails();
        Gianluca.getStudentDetails();
    }
}
