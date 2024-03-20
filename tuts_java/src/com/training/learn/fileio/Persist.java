package com.training.learn.fileio;

import java.io.*;

class Persist {
    public static void main(String args[]) {
        try {
            // Creating the object
            Student s1 = new Student(211, "ravi");
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("src\\com\\training\\learn\\fileio\\f1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("success stored");
            
            // now read
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\com\\training\\learn\\fileio\\f1.txt"));  
            Student s = (Student)in.readObject();  

            System.out.println(s.id+" "+s.name);
            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}