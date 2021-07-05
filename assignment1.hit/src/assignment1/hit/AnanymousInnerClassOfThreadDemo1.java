package assignment1.hit;

public class AnanymousInnerClassOfThreadDemo1 {
public static void main(String[] args) {
	Thread t1= new Thread("The Thread will Sleep") {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {}
		System.out.println("Iam awake after a 5sec sleep");
		
		//super.run();
	}
	};t1.start();
}
}
