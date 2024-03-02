package com.training.demo;

// import com.training.demo.model.*;
import com.training.demo.model.Person;
import org.training.learn.model.AccessTest2;
import com.training.demo.mathfunctions.Calculator;

public class Main {
    public static void main(String[] args) {
        // no import needed for SamePackage class(due to same package)
        SamePackage samePackage = new SamePackage();
        samePackage.print();
        // use the mathfunctions.Calculator
        Calculator calculator = new Calculator();
        System.out.println("Add: " + calculator.add(10.5, 20));
        System.out.println("Subtract: " + calculator.subtract(11.8, 20.44));
        System.out.println("Multiply: " + calculator.multiply(10, 20));
        System.out.println("Divide: " + calculator.divide(25.99, 5.33));


        // field default and local variable: local variable must be initialized before use but field variable is auto initialized to 0
        // int num1;
        // System.out.println(num1); // local variable must be initialized before use
        // field variable is private( and initialized to 0 README.md) error: only fields is permitted

        // use Access class in .model package
        AccessTest accessTest = new AccessTest();
        System.out.println("Num: " + accessTest.getNum()); // field/instent's  variable is private( and initialized to 0 README.md)
        System.out.println("Name: " + accessTest.getName());
        accessTest.setNum(10);
        accessTest.setName("uwe");
        System.out.println("Num: " + accessTest.getNum()); // field variable is private( and initialized to 0 README.md)
        System.out.println("Name: " + accessTest.getName());

        // use accessTest2 in org.training.learn.model package
        AccessTest2 accessTest2 = new AccessTest2(7);
        accessTest2.setNum(20);
        accessTest2.setName("Doe");
        System.out.println("Num: " + accessTest2.getNum()); 
        System.out.println("Name: " + accessTest2.getName());

        // WHY?
        /*
            java                                            stack           heap
            accessTest accessTest = new accessTest();  |   accessTest   | num = 0   |   name = null
            accessTest accessTestNew = new accessTest();  |   accessTestNew  | num = 0   |   name = null (another location in heap and stack)
        */

        System.out.println("\n###########################################");
        // use Person class in .model package
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        person1.setPersonId(101); person2.setPersonId(102); person3.setPersonId(103); person4.setPersonId(104);
        person1.setPersonName("DING DONG!"); person2.setPersonName("foo!"); person3.setPersonName("spam"); person4.setPersonName("bar");
        // System.out.println("Person ID: " + person1.getPersonId() + " \nPerson Name: " + person1.getPersonName());

        // display all person's data using loop
        Person[] persons = {person1, person2, person3, person4};
        for (Person person : persons) {
            // System.out.println("Person ID: " + person.getPersonId() + " \nPerson Name: " + person.getPersonName());
            // override the toString() method in Person class
            
            // System.out.println(person.toString()); -<or>-
            System.out.println(person); // toString() method is called automatically   
        }

    }
} // end of Main class
