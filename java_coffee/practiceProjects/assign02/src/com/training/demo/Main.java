package com.training.demo;

import com.training.demo.model.Student;
public class Main {
    // Main.java -> Create object of Student Class where Student (id,studentName,courseName)
    public static void main(String[] args) {
        Student student1 = new Student("John", "Java");
        Student student2 = new Student("Doe", "Python");
        Student student3 = new Student("Smith", "C++");
        Student student4 = new Student("Alex", "C#");
        Student student5 = new Student("Alex", "C#");

        // display using toString and for loop
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
        }
        
    }

}
