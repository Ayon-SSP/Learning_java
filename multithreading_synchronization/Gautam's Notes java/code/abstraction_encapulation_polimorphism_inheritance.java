abstract class bank{
    
   abstract double rate();
   
}
class SBI extends bank{
    
    private double rate;
    
    public void setRate(double rate){
        this.rate=rate;
    }
    
    public double rate(){
        return rate;
    }
    
} 
class HelloWorld {
    
    public static void main(String[] args) {
       
        SBI s1=new SBI();
        s1.setRate(9.22);
     
       System.out.println(s1.rate());
        
    }
}