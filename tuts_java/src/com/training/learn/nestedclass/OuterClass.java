package com.training.learn.nestedclass;

/*
 * Nested/inner class: Non-static && Static class and method
 */
public class OuterClass {
    // non-static field
    private int outerField;

    // Static field
    static int staticInt = 10;

    public void display() {
        System.out.println("Outer class");
        // Local inner class: Local variables can't be private, public, or protected. |
        // Local inner class cannot be invoked from outside the method | it is possible
        // to access the non-final local variable in the local inner class. after jdk
        // 1.8

        class LocalClass {
            public void display() {
                System.out.println("Local class");
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    // Inner Non-static class
    private class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
            System.out.println("constructor of inner class" + staticInt);
        }

        public void display() {
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }

    // Inner static class: It cannot access non-static data members and methods |
    // can be accessed by outer class name. | It can access static data members of
    // the outer class, including private | The static nested class cannot access
    // non-static (instance) data members or

    // static class methods are, by default, static
    static class InnerStaticClass {
        int innerInt = 10;
        private int innerStaticInt = 20;

        void display() {
            System.out.println("Inner static class" + " " + staticInt);
        }

        static void staticDisplay() {
            System.out.println("Inner static class" + " " + staticInt);
        }
    }

    public static void main(String[] args) {
        // inside of the class || static nested class
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        // System.out.println(innerStaticClass.innerInt);
        System.out.println(innerStaticClass.innerStaticInt);
        InnerStaticClass.staticDisplay();
        // To access the `static method` out of the class
        // OuterClass.InnerStaticClass innerStaticClass = new
        // OuterClass.innerStaticClass()
        // innerStaticClass.innerStaticInt = 20;

        // non-static nested class
        OuterClass.staticInt = 9;
        OuterClass outerObj = new OuterClass(10);
        OuterClass.InnerClass inner = outerObj.new InnerClass(20);
        inner.display();
        // to access the non-static method out of the class or package
        // OuterClass.InnerClass inner = outer.new InnerClass(20);

        // Anonymous Inner Classes

        // outside of the class
        Greeting greeting = new Greeting();
        System.out.println(greeting.greet("World"));
        System.out.println(Greeting.greetStatic("World"));

        System.out.println(Greeting.staticInt);
        System.out.println(greeting.defaultInt);
    }

    // Anonymous Inner Classes: class with no name, can instantiate only once within
    // the class.(only one object)

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

