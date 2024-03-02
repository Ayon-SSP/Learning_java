package com.training.demo.model;

public class Student {
    // Main.java -> Create object of Student Class where Student (id,studentName,courseName)
    private int id;
    private String studentName;
    private String courseName;
    private static int counter;

    {
        System.out.println("non static init block");
        this.id=++counter;
        System.out.println("New account number:"+this.id+" for "+this.studentName);
    }
    static {
        System.out.println("static init block");
        counter=0;
    }

    public Student() {}
    public Student(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }
    public Student(int id, String studentName, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.courseName = courseName;
    }
    public int getId() {
        return id;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public String toString() {
        return "Student [courseName=" + courseName + ", id=" + id + ", studentName=" + studentName + "]";
    }

}
