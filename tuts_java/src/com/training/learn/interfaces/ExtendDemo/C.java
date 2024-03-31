package com.training.learn.interfaces.ExtendDemo;

public interface C {
    // int x; // static final variable can't be reassigned
    int x = 10;

    default void foo(){
        System.out.println("Hello I'm in C interface");
    }

    default void inC(){
        System.out.println("Hello from inC() method");
    }
    
    static void inC2(){
        System.out.println("Hello from inC2() method");
    }
}
