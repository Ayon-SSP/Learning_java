package com.training.learn.abstractclass;

public abstract class Parent{
    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career(String name);
    abstract void partner(int age, String partnerName);
}
