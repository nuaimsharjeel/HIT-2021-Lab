package assignment1.hit;

import java.util.Date;



public class AnanymousInnerclassOfThreadDemo2 {
public static void main(String[] args) {
	VaccinationCenter vc=new VaccinationCenter();
	Thread t=Thread.currentThread();
	t.setName("Sharjeel");
	System.out.println(new Date());
	System.out.println("Before coming to the class");
	
	//Runnable r = new Runnable(){
   Thread kala =new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("the job given to kala is executed from this method");
			try {
				vc.getToken();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	},"kala");
   
   kala.start();
   System.out.println("Take class"+new Date());
}
}
class VaccinationCenter{
	public void getToken()throws Exception{
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+"....standing in queue for token...");
		Thread.sleep(10000);
		System.out.println("token recieved.."+new Date());
	}
}
