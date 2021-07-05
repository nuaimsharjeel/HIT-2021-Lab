package assignment1.hit;

public class ThreadDemo1InMethodExp {
	public static void main(String[] args)throws Exception {
		
		System.out.println("The thread will sleep");
		Thread t1=new Thread(ThreadDemo1InMethodExp::met);
		t1.start();
	
		//met();
		
		
		
	}
	static void met(){
		
		
		try {
		Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
		System.out.println("Iam awake after a 5sec sleep");
	}
}
