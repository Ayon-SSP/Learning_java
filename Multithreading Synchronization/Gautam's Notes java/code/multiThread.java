
class Bus  implements Runnable{
	
	String name = Thread.currentThread().getName();
	
	public void run() {
		
	
		try{
			
		
			for(int i=0;i<3;i++) {
				
				System.out.println(name);
			}
		
		}catch(Exception e) {
			
		}
		
	}
	
	
}
public class multiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus b = new Bus();
		Thread t1 =new Thread(b);
		// Thread t2 =new Thread(b);
		// Thread t3 =new Thread(b);
		
		t1.setName("t1");
		// t2.setName("t2");
		// t3.setName("t3");
		
		
		t1.start();
		// t2.start();
		// t3.start();

	}

}
