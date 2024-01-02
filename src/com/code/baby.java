//package com.code;
//
//public class baby {
//
//    public static void main(String[] args) {
//        System.out.println("This");
//    }
//}

// java is compiled as well as interpreted languages
// JDK - JAVA DEVELOPMENT KIT
// JRE - java runtime environment
/*
package com.code;

public class baby {
    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
*/

/*
public class baby {
    public static void main(String[] args) {
        System.out.print("The Sum is ");
        int val = 24;
        int val2 = 74;
        int val3 = 74;
        int sum = val + val2 + val3;
        System.out.println(sum);
        long a = 454444456543L;

        char ch = 'A';
        float f = 4.56f;
        double d =4.55D;
        String stritly = "killers";
        System.out.println(stritly);


    }
}
*/

/*
class baby{
    public static void main(String[] args){
        System.out.println("This is new line ");
        int val = 38;
        int sum = val+val;
        System.out.println(sum);
        String s = "This is my name";
        System.out.println(s);
        float f = 7.993f;
        double d = 3.543d;
        long l = 45567L;
        System.out.println(d);
        System.out.println(f);

    }
}

*/
/*
class baby{
    public static void main(String[] args){
        int val = 89;
        int val_1 = 84;
        if(val>val_1){
            System.out.println(val);
        }
        else{
            System.out.print(val_1);
        }

    }
}
*/
/*
class baby{
    public static void main(String[] args){
        int[] lst = {1,2,3,4,5,6};
        for(int val:lst){
            System.out.print(val);

        }

        int year=2020;
        String output=(number%2==0)?"even number":"odd number";
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }

    }
}
*/
/*
class baby{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
*/



//import java.util.Scanner;

//
//class baby {
//
//    public static void main(String[] args) {
//        System.out.println("This");
//        Scanner scan = new Scanner(System.in);
////        Scanner scan  = new Scanner(System.in);
//        int n1   = scan.nextLine();
////        System.out.print(n1+n2);
//    }
//}
/*
import java.util.Scanner;
interface na{
    public void emp_name();
}
interface id{
    public void emp_id();
}
class baby {
    void def() {
        System.out.println("Student Data");
    }
}

class main extends baby implements na,id{
    public void emp_name(){
        System.out.println("Ayon");
    }
    public void emp_id(){
        System.out.println("271");
    }

    public static void main(String[] args) {
        baby em = new baby();
        em.def();
        na s = new main();
        s.emp_name();
        id ss =new main();
        ss.emp_id();
    }
}
package com.company;
import java.sql.SQLOutput;
import  java.util.Scanner;
interface First{
    void input();
    void add();

}
class Main implements First{
    int x,y,z;
    Scanner sc=new Scanner(System.in);

    public void input(){
        System.out.println("enter the two numbers:");
        x= sc.nextInt();
        y= sc.nextInt();
    }
    public void add(){
        z=x+y;



    }
    void display(){
        System.out.println("sum is :"+z);
    }
    public static void main(String[] args){
        Main t=new Main();
        t.input();
        t.add();
        t.display();
    }
}
 */
/*
import java.sql.SQLOutput;
import java.util.Scanner;
public class baby{
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        String val = scan.nextLine();
//        String stri = scan.next();
//        int input = scan.nextInt();
//        System.out.println(input);

//        String intro = "ayon";
////        String intro = scan.nextLine();
//        System.out.println(intro.length());
//        System.out.println(intro.toUpperCase());
//        System.out.println(intro.toLowerCase());
//        System.out.println("this is " + "ayon");
//        System.out.println(intro + " \"this is good\"");
//        System.out.println(intro.indexOf("a"));
//        System.out.println(intro.charAt(1));
//        int nu1 = 4,num2 = 6;
//        System.out.println(Math.max(nu1,num2));
//        System.out.println(Math.abs(-22));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//
//        int[] marks = {1,2,3,4,5};
//        marks[3]  =  45;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[3]);
//        String[] subjscts = {"psnm","os","cn","fse","aoa"};
//        for(String subject:subjscts){
//            System.out.println(subject);
//        }







    }
}


 */
/*
class baby{
    static int sum_of_2(int a,int b){
        return a + b;
    }
    public static void main(String[] args){
        int[] marks = new int[5];
        marks[0]=1;
        marks[1]=5;
        marks[2]=6;
        marks[3]=3;
        marks[4]=7;
        // for(int mark:marks){
        //     System.out.println(mark);
        // }
        System.out.println(sum_of_2(3,5));


    }
    

}
*/

/*
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class baby{
    public static void main(String[] args) {
        
        // // Problem 1
        // Employee harry = new Employee();
        // harry.setName("CodeWithHarry");
        // harry.salary = 233;
        // System.out.println(harry.getSalary());
        // System.out.println(harry.getName());

        // // Problem 2
        // CellPhone asus = new CellPhone();
        // asus.callFriend();
        // asus.vibrate();
        // //asus.ring();


        // // Problem 3
        // Square sq = new Square();
        // sq.side = 3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());
         

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();


    }
}
*/
/*
class Employee {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public  class CWH {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}

*/
/*
package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
*/

/*
import java.util.Random;
import java.util.Scanner;

public class baby {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }
    }
}
*/
/*
import java.util.*;
class Exceptions {

    public static void main(String args[]) {
        int a, b, c;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("enter two num");
            a = in.nextInt();
            b = in.nextInt();
            c = a / b;
            System.out.println("ans is " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("hello people");

        }
    }

}
*/

// import java.sql.SQLOutput;
// import java.util.*;
/*
class baby {


    public static void main(String args[]) {
        int[] arr;


        arr = new int[5];
        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;
            arr[5] = 60;
            System.out.println(arr[0]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("hello people");
            System.out.println(arr[0]);
        }

    }

}
*/
/*
class calculate {

    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
}

public static void main(String[] args){
    System.out.println(add(1,2));
    System.out.println(add(2,3,4));
    System.out.println(add(4,5,6));
}
}

 */
/*
class baby{
    int sumi(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        baby obj = new baby();
        System.out.println(obj.sumi(3,5));
    }

}
*/
// CODE:-
/* 
import java.io.*;
class time
{
    int hour,min,sec;   
    public time(int h,int m,int s)
    {
        hour = h;
        min = m;
        sec = s;
    }
    public time()
    {
        hour = 0;
        min = 0;
        sec = 0;
    }
    public time sum(time t2)
    {
        time t3 = new time();
        t3.sec = sec + t2.sec;
        t3.min = min + t2.min;
        t3.hour = hour + t2.hour;
        if(t3.sec >= 60)
        {
            t3.min = t3.sec / 60;
            t3.sec = t3.sec % 60;
        }
        if(t3.min >= 60)
        {
            t3.hour = t3.min / 60;
            t3.min = t3.min % 60;
        }
        return(t3);  
    }
    public void display()
    {
        System.out.println(hour+ ":"+min+":"+sec);
    }
}
class timedemo
{
    public static void main(String args[])throws IOException
    {
        System.out.println("konakalla leela vamsi \n200303124295");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        time t1 = new time(1,56,55);
        time t2 = new time(2,00,10);
        time t3 = new time();
        t3 = t1.sum(t2);
        t1.display();
        t2.display();   
        t3.display();
    }
}
*/
/*
//5
//        *
//        **
//        ***
//        ****
//        *****

import java.util.*;
public class baby {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        int n = Integer.parseInt(scn.nextLine());
        String s = scn.nextLine();
        System.out.println(s);
        for(int j=1;j<=n;j++){
            for(int i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

//Functions
// import java.util.*;
//public class baby {
//    public static int funk(int n){
//        return n*n;
//    }
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = Integer.parseInt(scn.nextLine());
//        System.out.println(funk(n));
//
//        int[] arr;
//        arr = new int[5];
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 2;
//        arr[3] = 3;
//        arr[4] = 4;
//
//        System.out.println(arr.length);
//        for(int i=0;i<arr.length;i++){
//
//        }
//
//    }
//}
//public class baby
//{
//    //creating a function to rotate a matrix by 90 degrees Anti-clockwise
//    static void leftRotate(int matrix[][], int n)
//    {
//        //swapping elements of rows by columns that gives the transpose matrix
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i;j<n;j++)
//            {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        for(int i=0;i<n;i++)
//        {
//            //logic to swap columns
//            int low = 0;
//            int high = n-1;
//            while(low < high)
//            {
//                int temp = matrix[low][i];
//                matrix[low][i] = matrix[high][i];
//                matrix[high][i] = temp;
//                low++;
//                high--;
//            }
//        }
//        //prints the matrix elements after left rotation
//        System.out.println("Matrix After Left Rotation: ");
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                System.out.print(matrix[i][j]+" "+"\t");
//            }
//            System.out.println();
//        }
//    }
//    //driver code
//    public static void main(String args[])
//    {
//        //initialize number of rows and columns
//        int n=3;
//        //creating a 3*3 matrix
//        int matrix[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };
//        //prints the matrix
//        System.out.println("The Original Matrix is: ");
//        //loop for rows
//        for(int i=0;i<3;i++)
//        {
//            //loop for column
//            for(int j=0;j<3;j++)
//            {
//                //prints elements of the matrix
//                System.out.print(matrix[i][j]+" "+"\t");
//            }
//            System.out.println();
//        }
//        //function calling
//        leftRotate(matrix,n);
//    }
//}
/*
public class baby {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        System.out.println(n);

    }
}
*/


//---------------------------<Functions(java)>-----------------------------

// ncr
/*
public class baby{
    public static int fac(int n){
        int product = 1;
        for(int i=1;i<=n;i++){
            product *= i;
        }
        return product;
    }
    public static int ncr(int n,int r){
        return fac(n)/(fac(r)*fac(n-r));
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        System.out.println(ncr(n,r));
    }
}
*/

/*
public class baby{
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 86;
        arr[3] = 88;
        arr[4] = 18;
//        System.out.println(arr[0]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
*/

/*
public class baby{
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        System.out.println(lst + " -> " + lst.size());

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(1,15);
        lst.set(0,1000);
        lst.remove(2);
        System.out.println(lst + " -> " + lst.size());
        System.out.println(lst.get(1));
        for(int val:lst){
            System.out.println(val);
        }
    }
}
*/
/*
public class baby{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
        sb.insert(5," ");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.setCharAt(0,'h');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
*/
/*
public class baby {
    public static String compression1(String s){
        String st = s.charAt(0)+ "";
        for(int chIdx=1;chIdx < s.length();chIdx+=1){
            if(s.charAt(chIdx-1)!=s.charAt(chIdx)){
                st = st + s.charAt(chIdx);
           }
        }
        return st;
    }
    public static String compression2(String s){
        String st = s.charAt(0)+ "";
        int count = 1;
        for(int chIdx=1;chIdx < s.length();chIdx+=1){
            if(s.charAt(chIdx-1)!=s.charAt(chIdx)){
                if(count>1){
                    st = st + count;
                    count = 1;
                }
                st = st + s.charAt(chIdx);
            }else{
                count++;
            }
        }
        if(count>1){
            st = st + count;
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(compression1(s));
        System.out.println(compression2(s));
        scn.close();
    }
}
*/
/*
public class baby{
    public static StringBuffer toggleCase(String str){
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch>='a' && ch<='z'){
                char uch = (char)('A'+ch-'a');
                sb.setCharAt(i,uch);
            }else if(ch>='A' && ch<='Z'){
                char lch = (char)('a'+ch-'A');
                sb.setCharAt(i,lch);
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }
}
*/
/*
// import java.util.*;
public class baby {
    public static class person {
        person(){
            System.out.println("I am a person");

        }
        person(int age, String name){
            System.out.println("I am a person");
            System.out.println("My name is "+name+" and my age is "+age);
            this.age = age;
            this.name = name;
        }
        int age;
        String name;

        void saysHi() {
            System.out.println(name + "[" + age + "] says Hi");
        }
    }
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 10;
        p1.name = "A";
        p1.saysHi();

        person p2 = new person();
        p2.age = 20;
        p2.name = "B";
        p2.saysHi();

//        testing the copy
//        person p3 = p2;
//        p3.age = 30;
//        p3.saysHi();
//        System.out.println(p2);
//        System.out.println(p3);
//        p2.saysHi();
//        p2.saysHi();

//        swap
        swap(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap(person psn1,person psn2){
        person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
    }

}
 */


// public class baby {
//     public static void main(String[] args) {

// //        PriorityQueue<Integer> pq = new PriorityQueue<>(); // if you want the smallest value higher priority
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // if you want the smallest value higher priority

//         int[] ranks = {3,4,222,7867,443,1,4,7,86,5,678,};

//         for(int val: ranks){
//             pq.add(val);
//         }

//         while(pq.size() > 0){
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }