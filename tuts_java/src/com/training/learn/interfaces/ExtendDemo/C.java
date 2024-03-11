package com.training.learn.interfaces.ExtendDemo;

public interface C {
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
