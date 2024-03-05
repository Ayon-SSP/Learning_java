package com.training.demo;

import java.util.Scanner;

import com.training.demo.model.Student;
public class Main {
    // Main.java -> Create object of Student Class where Student (id,studentName,courseName)
    public static void main(String[] args) {
        // Student student1 = new Student("John", "Java");
        // Student student2 = new Student("Doe", "Python");
        // Student student3 = new Student("Smith", "C++");
        // Student student4 = new Student("Alex", "C#");
        // Student student5 = new Student("Alex", "C#");

        // // display using toString and for loop
        // Student[] students = {student1, student2, student3, student4, student5};
        // for (Student student : students) {
        //     System.out.println(student);
        // }


        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter no. of Books to be created: ");
        // int noOfBooks = scanner.nextInt();
        // Book[] books = new Book[noOfBooks];

        // for( int i = 0; i < noOfBooks; i++) {
        //     System.out.println("Enter Book Name: ");
        //     String bookName = scanner.next();
        //     System.out.println("Enter Author Name: ");
        //     String authorName = scanner.next();
        //     books[i] = new Book(bookName, authorName);
        // }

        // System.out.println("Books created are: ");
        // for (Book book : books) {
        //     System.out.println(book);
        // }

        // // update book details input book id
        // boolean iterate = true;
        // while (iterate) {
        //     System.out.println("Enter Book Id to be updated: ");
        //     int bookId = scanner.nextInt();
        //     for (Book book : books) {
        //         if (book.getId() == bookId) {
        //             System.out.println("Enter new Book Name: ");
        //             String bookName = scanner.next();
        //             System.out.println("Enter new Author Name: ");
        //             String authorName = scanner.next();
        //             book.setBookName(bookName);
        //             book.setAuthorName(authorName);
        //             System.out.println("Book updated successfully: ");
        //             System.out.println(book);
        //             iterate = false;
        //             break;
        //         }
        //     }
        //     if (iterate) {
        //         System.out.println("Book Id not found. Please enter valid Book Id.");
        //     }
        // }

        // // display book details input book id
        // System.out.println("Enter Book Id to display details: ");
        // int bookId = scanner.nextInt();
        // for (Book book : books) {
        //     if (book.getId() == bookId) {
        //         System.out.println("Book details: ");
        //         System.out.println(book);
        //         break;
        //     }
        //     if (iterate) {
        //         System.out.println("Book Id not found. Please enter valid Book Id.");
        //     }
        // }
        // scanner.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no. of Students to be created: ");
        int noOfStudents = scanner.nextInt();
        Student[] students = new Student[noOfStudents];

        for( int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter Student Name: ");
            String studentName = scanner.next();
            System.out.println("Enter Course Name: ");
            String courseName = scanner.next();
            students[i] = new Student(studentName, courseName);
        }

        System.out.println("Students created are: ");
        for (Student student : students) {
            System.out.println(student);
        }

        // update student details input student id
        boolean iterate = true;
        while (iterate) {
            System.out.println("Enter Student Id to be updated: ");
            int studentId = scanner.nextInt();
            for (Student student : students) {
                if (student.getId() == studentId) {
                    System.out.println("Enter new Student Name: ");
                    String studentName = scanner.next();
                    System.out.println("Enter new Course Name: ");
                    String courseName = scanner.next();
                    student.setStudentName(studentName);
                    student.setCourseName(courseName);
                    System.out.println("Student updated successfully: ");
                    System.out.println(student);
                    iterate = false;
                    break;
                }
            }
            if (iterate) {
                System.out.println("Student Id not found. Please enter valid Student Id.");
            }
        }

        // display student details input student id
        System.out.println("Enter Student Id to display details: ");
        int studentId = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == studentId) {
                System.out.println("Student details: ");
                System.out.println(student);
                break;
            }
            if (iterate) {
                System.out.println("Student Id not found. Please enter valid Student Id.");
            }
        }
        scanner.close();
        
    }

}
