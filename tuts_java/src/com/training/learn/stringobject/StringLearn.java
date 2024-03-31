package com.training.learn.stringobject;

public class StringLearn {
    public static void main(String[] args) {

        /*
        * Heap Memory: String Pool["Hello", "Hello World!"]

         * | "Hello"
         * | "Hello World!"
         * |
         */
        String s1 = "Hello"; // s1 -> "Hello"
        s1 = "Hello World!"; // s1 -> "Hello World!"
        System.out.println(s1);  // strings object's are immutable (Memory space saved)

        // ------------------------------------------------------------------------------------------
        String nameStrPool = "Ayon"; // String literal
        String nameStrPool2 = "Ayon";
        String nameStrPoolCopyed = nameStrPool;

        String nameObjectHeap = new String("Ayon");

        // String Pool["Ayon"] || Heap Memory["Ayon"]
        System.out.println(nameStrPool == nameStrPool2); // true
        System.out.println(nameStrPool == nameStrPoolCopyed); // true
        System.out.println(nameStrPool == nameObjectHeap); // false    Heap["Ayon"   "Ayon"  String Pool["Ayon"]]

        // String Builder: Mutable
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println(sb); // Hello World!

        // String Buffer: Mutable and Thread Safe
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World!");
        System.out.println(sbf); // Hello World!
        System.out.println(sbf.capacity()); // 21
    }
}
