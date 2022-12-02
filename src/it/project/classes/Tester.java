package it.project.classes;

public class Tester {

    public static void main(String[] args){

        Student student1, studen2;
        student1 = new Student("Franco");
        studen2 = new Student("Gianluca");

        Teacher teacher1 = new Teacher();
        teacher1.teacherName = "Paolo";

        teacher1.assignGrade(student1, 28);
        teacher1.assignGrade(studen2, 24);

        student1.getStudentDetails();
        studen2.getStudentDetails();
    }
}
