package assignment1.hit;
import java.util.Date;

public class ThreadDemo2InMethodExp {
static VaccinationnCenter vc;

private static void execute() {
	System.out.println("the job given to kala is executed from this method");
	try {
		vc.getToken();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args)throws Exception {
	 vc=new VaccinationnCenter();
	Thread t=Thread.currentThread();
	t.setName("Sharjeel");
	System.out.println(new Date());
	System.out.println("Before coming to the class");
	//method expression
	Thread kala1=new Thread(ThreadDemo2InMethodExp::execute,"kala");
	kala1.start();
	System.out.println(t.getName()+"Taking class...for 7-9 golden batch"+ new Date());
}
}
class VaccinationnCenter{
	public void getToken()throws Exception{
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+"....standing in queue for token...");
		Thread.sleep(5000);
		System.out.println("token recieved.."+new Date());
	}
}
