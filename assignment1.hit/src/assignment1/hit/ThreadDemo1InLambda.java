package assignment1.hit;

public class ThreadDemo1InLambda {
public static void main(String[] args) {
	
	Runnable r1=()->{
		try {
			Thread.sleep(5000);
			}
			catch(Exception e) {
				
			}
			System.out.println("Iam awake after a 5sec sleep");
		
	};
	Thread tt =new Thread(r1);
	System.out.println("the thread will go to sleep...");
	tt.start();
	
}
}
	



