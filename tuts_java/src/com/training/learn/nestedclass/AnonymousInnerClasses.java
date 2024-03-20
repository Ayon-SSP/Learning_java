package com.training.learn.nestedclass;
/*
 * Anonymous inner class:
 *  allwase created in the method & they don't have a name(if you don't want to inherit the class, you can use anonymous inner class) or (if you want to change the behavior of a method, only for a particular instance, you can use anonymous inner class)
 * run: javac -d . *.java [2 files will be created in the package(AnonymousInnerClasses.class & Animal.class & Anime.class & Runnable.class & Animal$1.class & Animal$2.class & Animal$3.class & Anonymous)] every time you create a new anonymous inner class, a new class file will be created
 * run: java com.training.learn.nestedclass.AnonymousInnerClasses
 * usualy anonymous classes are made for interfaces
 */
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
        int ayon$ = 7;
        System.out.println(ayon$);

        bigfoot.makeNoise();

        Animal dog = new Animal() {
            public void makeNoise() {
                System.out.println("Dog says: Woof woof!");
            }
        };

        dog.makeNoise();

        Anime myAnime = new Anime() {
            public void makeNoise() {
                System.out.println("Anime says: I am an anime!");
            }
        };

        myAnime.makeNoise();

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
