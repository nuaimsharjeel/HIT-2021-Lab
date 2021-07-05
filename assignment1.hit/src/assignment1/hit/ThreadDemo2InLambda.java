package assignment1.hit;

import java.util.Date;



public class ThreadDemo2InLambda {
	public static void main(String[] args) {
		Vaccinationn1Center vc=new Vaccinationn1Center();
		Thread t=Thread.currentThread();
		t.setName("Sharjeel");
		System.out.println(new Date());
		System.out.println("Before coming to the class");
		
		Thread kala=new Thread(()->{ 
			System.out.println("the job given to kala is executed from this method");
			try {
				vc.getToken();
			}catch(Exception e) {
				e.printStackTrace();
			}
		},"kala");
		kala.start();
		System.out.println(t.getName()+"Taking class...for 7-9 golden batch"+ new Date());
		}
	

}
class Vaccinationn1Center{
	public void getToken()throws Exception{
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+"....standing in queue for token...");
		Thread.sleep(10000);
		System.out.println("token recieved.."+new Date());
	}
}