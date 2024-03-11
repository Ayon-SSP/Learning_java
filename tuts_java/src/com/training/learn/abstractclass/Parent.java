package com.training.learn.abstractclass;

public abstract class Parent{
    int age;
    static int count = 0;
    final String PARENT_NAME = "Parent";

    public Parent(int age) {
        this.age = age;
    }
    // public abstract Parent();

    abstract void career(String name);
    abstract void partner(int age, String partnerName);

    void myDetails() {
        System.out.println("My Name/age is " + PARENT_NAME + age);
    }
    // create a final method
    public final void myFinalMethod() {
        System.out.println("This is a final method");
    }

    // create a static method
    public static void myStaticMethod() {
        System.out.println("This is a static method");
    }
}
