package com.training.learn.interfaces.ExtendDemo;

public class Main implements B, C {

    @Override
    public void foo(){
        System.out.println("Hello from fun() method");
    }

    @Override
    public void bar(){
        System.out.println("Hello from foo() method");
    }
    public static void main(String[] args) {
        
        // class Car extends Vehicle implements Engine, Media, Break
        // interface A {foo() bar()}
        // interface B extends A {foo()}
        // interface C {default foo() default inC() static inC2()}
        // Main implements B, C 

        Main obj = new Main();
        obj.foo();
        obj.inC();
        C.inC2();
        // obj.x = 20; // static final variable can't be reassigned
        System.out.println(C.x);
    }
}
