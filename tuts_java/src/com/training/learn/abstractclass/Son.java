package com.training.learn.abstractclass;

public class Son extends Parent{
    // public Son(int age) {
    //     this.age = age;
    // }
    public Son(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("My son's career is " + name);
    }

    @Override
    void partner(int age, String partnerName) {
        System.out.println("My son's partner's name is " + partnerName + " and age is " + age);
    }
}
