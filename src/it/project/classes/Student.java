package it.project.classes;

public class Student {
    private String name;
    public int grade;

    public Student( String name){
        this.name = name;
        System.out.println("the student " + name + " has been created.");
    }

    public String getName(){
        return this.name;
    }

    public void getStudentDetails(){
        System.out.println("The grade of student " + this.name + " is " + this.grade);
    }
}
