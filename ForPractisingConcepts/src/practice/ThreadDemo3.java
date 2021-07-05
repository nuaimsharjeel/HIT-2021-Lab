package practice;

public class ThreadDemo3 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	t.setName("Sharjeel");
	
	ReservationJob counter=new ReservationJob();
	
	Thread wasee=new Thread(new BookingJob(counter,600),"Wasee");
	Thread shajju=new Thread(new BookingJob(counter,400),"Shajju");
	wasee.start();
	shajju.start();
}
}
class BookingJob implements Runnable{
     ReservationJob counter;int amt;
     public BookingJob(ReservationJob counter,int amt) {
    	 this.counter=counter;
    	 this.amt=amt;
     }
	@Override
	public void run() {
		
		synchronized(counter) {
		counter.BookTicket(amt);
		counter.givechange();
	}
	}
	
}




class ReservationJob {
	int amt;
   public void BookTicket(int amt) {
    	Thread t=Thread.currentThread();
    	this.amt=amt;
    	String name=t.getName();
    	System.out.println(name+" has come to book ticket");
    	System.out.println(name+" has bought "+amt);
    	
    }
	
    public void givechange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("The ticket has been booked for Mr."+name);
		System.out.println("The change has been returned " +(amt-100));
	}
}