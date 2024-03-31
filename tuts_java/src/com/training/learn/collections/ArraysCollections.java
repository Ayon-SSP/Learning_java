package com.training.learn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysCollections {
    // Passing Array to a Method in Java and Returning Anonymous Array from the Method
    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * stack memory | heap memory
         *      num ->  |  [0, 0, 0, 0, 0]
         */
        int[] num; // declaration | compile time
        num = new int[5]; // instantiation, object is created in the heap memory | runtime
        // it depends on JVM to allocate memory in contiguous or ...
        // dinamically allocated memory (dynamic memory allocation)

        int[] numbers = new int[5]; // primitive data type array
        String[] names = new String[5]; // reference data type array
        int[][] multiDimArr = new int[2][3]; // multi-dimensional array

        int[] numbers2 = { 1, 2, 3, 4, 5 };
        
        // array list only stores objects (reference data type)
        ArrayList<String> namesList = new ArrayList<String>(); // no fixed size
        ArrayList<String> namesList1 = new ArrayList<>(Arrays.asList("Ayon", "karmakar", "sahab"));
        /*
         * [https://youtu.be/n60Dn0UsbEk?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=2232]
         * stack memory | heap memory
         * namesList -> |  [ref1,  ref2,   ref3, null, null]
         *              |   |      |       | 
         *              |  🔽     🔽      🔽
         *              | "Ayon" "karmakar" "sahab"
         */

        for (int value : numbers2) {
            value = sc.nextInt();
            System.out.println(value);
        };
        for (int val: numbers2) System.out.print(val + " ");
        System.out.println();

        for (String name : namesList1) {
            System.out.println(name);
        }

        namesList1.addAll(Arrays.asList("broo", "foooooo", "barrrrrr"));

        System.out.println(numbers.length + " " + numbers[0]); // 5 0
        System.out.println(namesList1.size() + " " + namesList1.get(0)); // 3 Ayon
        System.out.println(num + " " + numbers + " " + names + " " + multiDimArr + " " + numbers2 + " " + namesList + " " + namesList1); // [I@15db9742 [I@6d06d69c [Ljava.lang.String;@7852e922 [[I@4e25154f [I@70dea4e [Ljava.lang.String;@5c647e05 [Ayon, Rahman, Rafi]
        System.out.println("namesList1: " + namesList1); // namesList1: [Ayon, Rahman, Rafi]
        System.out.println(namesList1.toString());

        namesList1.add("krishna");
        namesList1.remove(namesList1.size() - 1);

        System.out.println("-------------------------");
        System.out.println(reverseArray(new int[] { 1, 2, 3, 4, 5 }).toString()); // [5, 4, 3, 2, 1]

        // ArrayIndexOutOfBoundsException Error
        // System.out.println(numbers2[5]);

        // Multidimensional Array in Java
        // int[][] arr1 = new int[3][3];
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        /*
        0 1 2 
        3 4 5 6 
        7 8 
         */

        //  What is the class name of Java array?
        System.out.println(arr.getClass().getName()); // [[I
        // System.arraycopy(copyFrom, 2, copyTo, 0, 7);  // coping array
        // int carr[]=arr.clone();  // Cloning an Array in Java(2 different address)


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.size(); // 2
        list.get(0); // 1

        sc.close();
    }
}
