package assignment1.hit;


public class AnanymousInnerclassOfThreadDemo3 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	t.setName("Sharjeel");
	
	ReservationJob counter=new ReservationJob();
	
     Thread wasee=new Thread(new Runnable() {

		@Override
		public void run() {
			
				counter.BookTicket(500);
				counter.givechange();}

		
		},"wasee");
     wasee.start();
     
     Thread shajju=new Thread(new Runnable() {

 		@Override
 		public void run() {
 			
 				counter.BookTicket(1000);
 				counter.givechange();}

 		
 		},"shajju");
      shajju.start();
}
}
class ReservationJob {
	int amt;
   synchronized public void BookTicket(int amt) {
    	Thread t=Thread.currentThread();
    	this.amt=amt;
    	String name=t.getName();
    	System.out.println(name+" has come to book ticket");
    	System.out.println(name+" has bought "+amt);
    	
    }
	
   synchronized public void givechange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("The ticket has been booked for Mr."+name);
		System.out.println("The change has been returned " +(amt-100));
	}
}