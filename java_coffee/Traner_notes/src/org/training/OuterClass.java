package org.training;
/*
 * Non-static && Static class and method
 */
public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    // Non-static nested class
    public class InnerClass {
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

    static class InnerStaticMain {
        int innerInt = 10;
        private int innerStaticInt = 20;
    }

    public static void main(String[] args) {
        // inside of the class
        InnerStaticMain innerStaticMain = new InnerStaticMain();
        System.out.println(innerStaticMain.innerStaticInt);

        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass(20);
        inner.display();


        // outside of the class
        Greeting greeting = new Greeting();
        System.out.println(greeting.greet("World"));
        System.out.println(Greeting.greetStatic("World"));

        System.out.println(Greeting.staticInt);
        System.out.println(greeting.defaultInt);
    }
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
