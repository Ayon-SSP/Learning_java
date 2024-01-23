// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class A{
    
    int a=10;
    static int b;
    
    static{
        
        b=1;
    }
    void print(){
        
        b=10;
      
        System.out.println("\n a val is : "+a);
        System.out.println("\n b of a1 val is : "+b);
        
    }
    void print2(){
        
         System.out.println("\n b of a2 val is : "+b);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World! \n\n");
        A a1 = new A();
        A a2 = new A();
        
        a1.print();
        a2.print2();
    }
}