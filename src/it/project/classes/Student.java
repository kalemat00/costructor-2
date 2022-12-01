package it.project.classes;

public class Student {
    public String name;
    public int grade;

    public Student( String name){
        this.name = name;
        System.out.println("the student " + name + " has been created.");
    }

    public void getStudentDetails(){
        System.out.println("The grade of student " + this.name + " is " + this.grade);
    }
}
