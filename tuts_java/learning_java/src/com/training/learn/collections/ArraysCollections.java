package com.training.learn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysCollections {
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
        ArrayList<String> namesList1 = new ArrayList<>(Arrays.asList("Ayon", "Rahman", "Rafi"));
        /*
         * [https://youtu.be/n60Dn0UsbEk?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=2232]
         * stack memory | heap memory
         * namesList -> |  [ref1,  ref2,   ref3, null, null]
         *              |   |      |       | 
         *              |  🔽     🔽      🔽
         *              | "Ayon" "Rahman" "Rafi"
         */

        for (int value : numbers2) value = sc.nextInt();
        for (int val: numbers2) System.out.print(val + " ");
        System.out.println();

        for (String name : namesList1) {
            System.out.println(name);
        }

        System.out.println(numbers.length + " " + numbers[0]); // 5 0
        System.out.println(namesList1.size() + " " + namesList1.get(0)); // 3 Ayon
        System.out.println(num + " " + numbers + " " + names + " " + multiDimArr + " " + numbers2 + " " + namesList + " " + namesList1); // [I@15db9742 [I@6d06d69c [Ljava.lang.String;@7852e922 [[I@4e25154f [I@70dea4e [Ljava.lang.String;@5c647e05 [Ayon, Rahman, Rafi]
        System.out.println("namesList1: " + namesList1); // namesList1: [Ayon, Rahman, Rafi]
        System.out.println(namesList1.toString());

        namesList1.add("Rahim");
        namesList1.remove(namesList1.size() - 1);

        
    }

}
