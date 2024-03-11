package com.training.learn.abstractclass;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son(25);
        Parent daughter = new Daughter(22);
        son.career("Engineer");
        son.partner(25, "Sara");
        daughter.career("Doctor");
        daughter.partner(23, "John");

        // Parent mom = new Parent(45); // Cannot create an object of an abstract class
        son.myDetails(); // Parent.myDetails()
        Parent.myStaticMethod(); // Parent.myStaticMethod()
    }

}
