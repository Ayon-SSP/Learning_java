// package com.training.learn.fileio;

// import java.io.*;
// // transient if you don't want to serialize the data member of a class
// class Person implements Serializable {
//     int id;
//     String name;

//     Person(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
// }

// class Student extends Person {
//     String course;
//     int fee;

//     public Student(int id, String name, String course, int fee) {
//         super(id, name);
//         this.course = course;
//         this.fee = fee;
//     }
// }

// public class SerializeISA {
//     public static void main(String args[]) {
//         try {
//             // Creating the object
//             Student s1 = new Student(211, "ravi", "Engineering", 50000);
//             // Creating stream and writing the object
//             FileOutputStream fout = new FileOutputStream("src\\com\\training\\learn\\fileio\\f.txt");
//             ObjectOutputStream out = new ObjectOutputStream(fout);
//             out.writeObject(s1);
//             out.flush();
//             // closing the stream
//             out.close();
//             System.out.println("success");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         try {
//             // Creating stream to read the object
//             ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\com\\training\\learn\\fileio\\f.txt"));
//             Student s = (Student) in.readObject();
//             // printing the data of the serialized object
//             System.out.println(s.id + " " + s.name + " " + s.course + " " + s.fee);
//             // closing the stream
//             in.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
