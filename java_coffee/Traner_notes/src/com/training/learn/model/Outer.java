package com.training.learn.model;

public class Outer {
    public static void main(String[] args) {
        // pen p1= new pen();
        System.out.println(pen1.getcount());

    }
    // create a static class
    static class pen1 {
        static int pencoubt = 2;
        

        public static int getcount() {
            // access the var_static from the main class
            return pencoubt;
        }

    }
}
class pen {
    static int pencoubt = 2;

    public static int getcount() {
        return pencoubt;
    }
}