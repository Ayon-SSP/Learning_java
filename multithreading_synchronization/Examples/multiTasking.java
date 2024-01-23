// package Examples;
// import java.lang.Thread;

// class Work extends Thread {

//     // run function is overrided function.
//     public void run(int WorkID) throws InterruptedException{
//         // 1. eating 2. sleeping 3. working 4. running
//         if (WorkID == 1){
//             for(int i = 0; i < 5; i++){ System.out.println("🍴 - Eating"); Thread.sleep(500);}
//         }else if (WorkID == 2){
//             for(int i = 0; i < 5; i++){ System.out.println("😴 - Sleeping"); Thread.sleep(500);}
//         }else if (WorkID == 3){
//             for(int i = 0; i < 5; i++){ System.out.println("👷‍♂️ - working"); Thread.sleep(500);}
//         }else if (WorkID == 4){
//             for(int i = 0; i < 5; i++){ System.out.println("🕺👯 - dancing"); Thread.sleep(500);}
//         }else{
//             System.out.println("No work found");
//         }

        
//     }
// }

// public class multiTasking {
//     public static void main(String[] args) throws InterruptedException {
//         // create 4 objects of class Work and call start() function together to show all are working together.
//         Work t1 = new Work();
//         Work t2 = new Work();
//         Work t3 = new Work();
//         Work t4 = new Work();

//         t1.run(1);
//         t2.run(2);
//         t3.run(3);
//         t4.run(4);
//     }
// }



// import java.lang.Thread;

// class Work implements Runnable {

//         String name= Thread.currentThread().getName();
//     // run function is overrided function.
//     public void run()  {
//             for(int i = 0; i < 5; i++){ System.out.println(name);}

        
//     }
// }


// public class multiTasking {
//     public static void main(String[] args)  {
//         // create 4 objects of class Work and call start() function together to show all are working together.
//         Work w1 = new Work();

//         Thread t2 = new Thread(w1);
//         Thread t3 = new Thread(w1);

//         t2.setName("Thread 1");
//         t3.setName("Thread 2");

//         t2.start();
//         t3.start();
//     }
// }