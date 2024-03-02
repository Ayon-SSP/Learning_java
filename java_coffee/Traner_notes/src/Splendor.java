// class Bank {
//     float getRateOfInterest() {
//         return 0;
//     }
// }

// class SBI extends Bank {
//     float getRateOfInterest() {
//         return 8.4f;
//     }
// }

// class ICICI extends Bank {
//     float getRateOfInterest() {
//         return 7.3f;
//     }
// }

// class AXIS extends Bank {
//     float getRateOfInterest() {
//         return 9.7f;
//     }
// }

// class TestPolymorphism {
//     public static void main(String args[]) {
//         Bank b;
//         b = new SBI();
//         System.out.println("SBI Rate of Interest: " + b.getRateOfInterest()); // 8.4
//         b = new ICICI();
//         System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest()); // 7.3
//         b = new AXIS();
//         System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest()); // 9.7
//     }
// }

// class TestOverloading4 {
//     public static void main(String[] args) {
//         System.out.println("main with String[]");
//     }

//     public static void main(String args) {
//         System.out.println("main with String");
//     }

//     public static void main() {
//         System.out.println("main without args");
//     }
// }

// class OverloadingCalculation2 {
//     // void sum(int a,int b){System.out.println("int arg method invoked");}
//     void sum(long a, long b) {
//         System.out.println("long arg method invoked");
//     }

//     public static void main(String args[]) {
//         OverloadingCalculation2 obj = new OverloadingCalculation2();
//         obj.sum(20, 20);// now int arg sum() method gets invoked
//     }
// }

class Bike {
    int speedlimit = 90;

    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    int speedlimit = 150;

    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splendor();// upcasting
        b.run(); // running safely with 60km
        System.out.println(b.speedlimit); // 90 (because speedlimit is not overridden) (and the type is premitive)
    }
}