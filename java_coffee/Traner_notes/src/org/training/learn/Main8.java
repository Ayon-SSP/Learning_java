package org.training.learn;

// import org.training.learn.model.Greeting;
public class Main8 {
    public static void main(String[] args) {
        // org.training.learn.model.Greeting greeting = new org.training.learn.model.Greeting();
        // System.out.println(greeting.greet("World"));
        // Greeting greeting = new Greeting();
        // System.out.println(greeting.greet("World"));

        Greeting greeting = new Greeting();
        System.out.println(greeting.greet("World"));
    }
    
}

class Greeting {
    public String greet(String name) {
        return "Hello " + name;
    }
}