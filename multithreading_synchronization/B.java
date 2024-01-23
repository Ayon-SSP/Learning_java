package multithreading_synchronization;

import java.lang.Thread;

class A extends Thread {

    // run function is overrided function.
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Inside class 'A' funk 'run()': performed by <object> Thread");
            // sleep for a second
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
        
    }
}

// what to do if I want more 3 threads run together?
// Ans: create 3 more objects of class A and call start() function together to show all are working together.


public class B {
    public static void main(String[] args) {
        A t = new A(); // 1st thread (main thread)
        t.start(); // 2nd thread (object thread)
        
        for(int i = 0; i < 5; i++){
            System.out.println("Inside class 'B' funk 'main()': performed by <main> Thread");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
