package com.training.learn.polymorphism;

//parent class  
class Sample {
    // method of the parent class
    public void display() {
        System.out.println("Overridden Method From Sample Class");
    }
}

// derived or child class
public class Demo extends Sample {
    // method of child class
    public void display() {
        System.out.println("Overriding Method From Demo Class");
    }

    public static void main(String args[]) {
        // assigning a child class object to parent class reference
        Sample obj = new Demo();
        // invoking display() method
        obj.display();
    }
}