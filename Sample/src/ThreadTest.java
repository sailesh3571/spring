
/**
 * @author sailesh
 *
 */
public class ThreadTest implements Runnable {
	
	public void run (){
		System.out.println("run");
		System.out.println("walk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest t = new ThreadTest();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("walk");
		
try{
	t1.join();
}
catch(InterruptedException e){
	
}
	System.out.println("eat");

}

	
}
