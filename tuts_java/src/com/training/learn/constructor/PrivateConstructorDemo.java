package com.training.learn.constructor;

public class PrivateConstructorDemo {
    private PrivateConstructorDemo() {
        System.out.println("Private Constructor");
    }
    public void display() {
        System.out.println("Public Method");
    }

    public static void main(String[] args) {
        PrivateConstructorDemo obj = new PrivateConstructorDemo();
        obj.display();
    }
}