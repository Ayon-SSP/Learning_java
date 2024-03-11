package com.training.learn.interfaces.NestedInterface;

class A {
    public interface NestedInterface {
        void foo();
    }
}


class B implements A.NestedInterface {
    public void foo() {
        System.out.println("Hello from foo() method");
    }
    public static void main(String[] args) {
        B b = new B();
        b.foo();
    }
}
