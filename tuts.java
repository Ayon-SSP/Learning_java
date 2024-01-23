// This is a package

import java.util.*;
// import java.util.Scanner;

public class tuts {
    public static String funk(int arg, String name) {
        System.out.println("Funk");
        return arg + name;
    }

    public static String getBin(int num) {
        String bin = "";
        while(num > 0) {
            bin = (num % 2) + bin;
            num /= 2;
        }
        return bin;+ 
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        
        /*
        Input types
            next
            nextInt
            nextDouble
            nextFloat
            nextBoolean
            nextLine
            ...
        */
        Scanner sc = new Scanner(System.in);

        // String name_NEXT = sc.next();
        // System.out.println("Using Next: " + name_NEXT);

        // System.out.println("Enter your name, num, bool: ");
        // String name = sc.nextLine(); System.out.println("Your name is: " + name);
        // int num = sc.nextInt(); System.out.println("Your num is: " + num);
        // boolean bool = sc.nextBoolean(); System.out.println("Your bool is: " + bool);
        
        // String description  = sc.nextLine(); System.out.println("Your description is: " + description);

        // Implicit type casting, widining, type conversion
        // cant store string in int( small datatype can be stored in bigger datatypes)
        // bit -> short -> int -> float -> long -> double

        // Type cast(narrowing conversion or expelicit type conve.) num = (int) (pif);

        // char ch = 'A';
        // int num = ch;
        // // int num = (int) ch;
        // System.out.println("Implicit type casting: " + num); // 65
        
        /*
        Type promotion
            a -> char; b -> byte; c -> short; d -> int
            a + b * c / d
            java automatically promotes each byte, short or char operand to int when evaluating an expression.
            sout(a + b) -> int

        
        */

        // byte -> short -> int -> long -> float -> double
        // int num = 10;
        // double pif = num;
        // System.out.println("Implicit type casting: " + pif); // 10.0


        // JDK -> JRE + Development Tools
        // JRE(Java runtime env) -> JVM + Libraries

        // int Cat$ch = 1; 
        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        
        // how to know the type of a this (f * b) + (i % c) - (d * s);
        // The type is double: check the higest space consumation datatype in the equation.
        

        // dec to bin

        System.out.println(getBin(10));















        sc.close();
    }

    // private static char[] type(double d) {
    //     return null;
    // }
}