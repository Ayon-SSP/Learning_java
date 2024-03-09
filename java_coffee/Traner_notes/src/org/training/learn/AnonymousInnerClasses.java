package org.training.learn;

public class AnonymousInnerClasses {
    
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();
        
        // Anonymous inner class: one time use class
        Animal bigfoot = new Animal() {
            public void makeNoise() {
                System.out.println("Bigfoot says: Go away!");
            }
        };

        bigfoot.makeNoise();

        Animal dog = new Animal() {
            public void makeNoise() {
                System.out.println("Dog says: Woof woof!");
            }
        };

        dog.makeNoise();

        // runnable: interface with one method(no need to create a class to implement it, just use anonymous inner class to implement it)
        Runnable myAnomymousrunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable running runningggg...");
            }
        };

        myAnomymousrunnable.run();
    
        // AnonymousInnerClasses aic = new AnonymousInnerClasses();
        // aic.myAnimal.makeNoise();
        // aic.bigfoot.makeNoise();
        // aic.dog.makeNoise();
    }
    
}
