package com.training.learn.interfaces;

public interface Engine {
    
    String MODEL = "V8";
    public static final int PRICE = 78000; // by default, public, static, and final (i.e., no need to declare them)

    void start();
    void stop();
    void accelerate(); // by default, public and abstract (i.e., no need to declare them)
    void decelerate();
    void turn();
    void changeGear();

    // final void printModel(); // final methods are not allowed in interfaces
    // final void printModel(){
    //     System.out.println("Model: " + MODEL);
    // } // abstract methods are not allowed in interfaces
    
    // private void printPrice(){
    //     System.out.println("Price: " + PRICE);
    // } // can have private methods but not allowed to call them from outside the interface


}