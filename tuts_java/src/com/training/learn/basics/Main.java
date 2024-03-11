/*
 * cd 'C:\CODE\1`]_Lets_Compile\3`]_learning_java\tuts_java\learning_java\src\com\training\learn\basics\'  
 * javac Main.java      OR    javac -d . *.java
 * java Main "Ayon" 44  OR    java com.training.learn.basics.Main AYON 'SSP' 1 23 0.4
 */


package com.training.learn.basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}

/*
PS C:\Users\admin\Downloads> javac Main.java
PS C:\Users\admin\Downloads> java Main "Ayon" 44
Hello World!
2
Ayon
44
 */