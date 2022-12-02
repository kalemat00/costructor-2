package it.project.classes;

public class Teacher {
    public String teacherName;

    public Teacher(){
        System.out.println("a teacher has been created");
    }

    public void assignGrade(Student student, int finalGrade){
        System.out.println(" ------------ ");
        student.grade = finalGrade;
        System.out.println("The student " + student.getName() + " has received the grade: " + finalGrade);
        System.out.println(" ------------ \n");
    }
}
