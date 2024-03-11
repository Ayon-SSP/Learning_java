
package com.training.learn.polymorphism;

class Animal {
}

class Dog3 extends Animal {
    static void method(Animal a) {
        if (a instanceof Dog3) {
            Dog3 d = (Dog3) a;// downcasting
            System.out.println("ok downcasting performed" + d);
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog3();
        Dog3.method(a);
    }

}


// example 2
// class Animal {
// }

// class Dog4 extends Animal {

//     static void method(Animal a) {
//         Dog4 d = (Dog4) a;// downcasting
//         System.out.println("ok downcasting performed");
//     }

//     public static void main(String[] args) {
//         Animal a = new Dog4();
//         Dog4.method(a);
//     }
// }



// example 3
interface Printable {
}

class A implements Printable {
    public void a() {
        System.out.println("a method");
    }
}

class B implements Printable {
    public void b() {
        System.out.println("b method");
    }
}

class Call {
    void invoke(Printable p) {// upcasting
        if (p instanceof A) {
            A a = (A) p;// Downcasting
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;// Downcasting
            b.b();
        }

    }
}// end of Call class

class Test4 {
    public static void main(String args[]) {
        Printable p = new B();

        
        Call c = new Call();
        c.invoke(p);
    }
}
