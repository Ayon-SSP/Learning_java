package com.training.learn.abstractclass;

public class Daughter extends Parent{

    // public Daughter(int age) {
    //     this.age = age;
    // }
        public Daughter(int age) {
            super(age);
        }
        @Override
        void career(String name) {
            System.out.println("My daughter's career is " + name);
        }
    
        @Override
        void partner(int age, String partnerName) {
            System.out.println("My daughter's partner's name is " + partnerName + " and age is " + age);
        }

}
