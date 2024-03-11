package com.training.learn.exeorder;

class Parent {
    int x = 10;
    static {
        System.out.println("Parent: Static block");
    }
    
    {
        System.out.println("Parent: Instance 1st | Fields (Variables) " + x);
    } {
        System.out.println("Parent: Instance 2nd | Fields (Variables) " + x);
    }
    
    Parent() {
        // static int x = 20; // Local variable cannot be static
        System.out.println("Parent: <Constructor>");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child: Static block");
    }
    
    {
        System.out.println("Child: Instance initializer block | Fields (Variables) " + x);
    }
    
    Child() {
        super();
        System.out.println("Child: <Constructor>");
    }
}

public class Main {
    public static void main(String[] args) {
        final int PI; // blank or uninitialized final variable
        PI = 3;
        System.out.println("PI: " + PI);

        Child child = new Child();
        child.x = 20;

    }
}