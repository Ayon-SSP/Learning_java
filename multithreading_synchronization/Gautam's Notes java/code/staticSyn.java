// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Bank extends Thread{
    
    static int bal=5000;
    static int withdraw;
    
    Bank(int withdraw){
        
        this.withdraw=withdraw;
        
    }
    
    public static synchronized void withdraw(){
        
        String name=Thread.currentThread().getName();
        
        if(bal<withdraw){
            
            System.out.print("\n Not Allowed \n");
        }
        else{
            
            System.out.println("\n\n Withdraw money : "+ name+"\n");
            bal = bal-withdraw;
            System.out.print("\n\n Balance money : "+ bal+"\n");
        }
        
    }
    
    public void run(){
        
        withdraw();
    }
    
    
}

class HelloWorld {
    public static void main(String[] args) {
        
        Bank b =new Bank(5000);
        Bank b2 =new Bank(5000);
        
        Thread t1=new Thread(b);
        Thread t2 = new Thread(b);
        t1.setName("Raju");
        t2.setName("Ram");
        
        Thread t3=new Thread(b2);
        Thread t4 = new Thread(b2);
        t1.setName("Payal");
        t2.setName("Punam");
        
        t1.start();
        t2.start();
        
        t3.start();
        t4.start();
        // b.start();
    
    }
}