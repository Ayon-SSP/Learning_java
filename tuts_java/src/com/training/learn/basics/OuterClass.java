package com.training.learn.basics;
/*
 * Nested/inner class: Non-static && Static class and method
 */
public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    public void display() {
        System.out.println("Outer class");
        class LocalClass {
            public void display() {
                System.out.println("Local class");
            }
        }
    }

    // use LocalClass
    

    // Non-static nested class
    private class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
            System.out.println("constructor of inner class");
        }

        public void display() {
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }

    static int staticInt = 10;

    static class InnerStaticMain {
        int innerInt = 10;
        private int innerStaticInt = 20;
    }

    public static void main(String[] args) {
        // inside of the class || static nested class
        InnerStaticMain innerStaticMain = new InnerStaticMain();
        System.out.println(innerStaticMain.innerStaticInt);        
        // To access the `static method` out of the class
        // OuterClass.InnerStaticMain innerStaticMain = new OuterClass.InnerStatic
        // innerStaticMain.innerStaticInt = 20;
        
        
        // non-static nested class
        OuterClass.staticInt = 9;
        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass(20);
        inner.display();
        // to access the non-static method out of the class or package
        // OuterClass.InnerClass inner = outer.new InnerClass(20);
        


        // outside of the class
        Greeting greeting = new Greeting();
        System.out.println(greeting.greet("World"));
        System.out.println(Greeting.greetStatic("World"));

        System.out.println(Greeting.staticInt);
        System.out.println(greeting.defaultInt);
    }

    // use LocalClass
    
}


class Greeting {
    static int staticInt = 30;
    int defaultInt = 30;

    public String greet(String name) {
        return "Hello " + name;
    }
    public static String greetStatic(String name) {
        return "Static: Hello " + name;
    }
}
