package practice;

public class ThreadDemo1 {
public static void main(String[] args)throws Exception {
	Thread t=Thread.currentThread();
	t.setName("Hi");
	t.setPriority(10);
	System.out.println("The thread will sleep");
	met();
	System.out.println("iam awake");
	
	
}
static void met()throws Exception{
	
	System.out.println("hello");
	Thread.sleep(5000);
}
}
