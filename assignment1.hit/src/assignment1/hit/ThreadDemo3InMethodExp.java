package assignment1.hit;



public class ThreadDemo3InMethodExp {
	static ReservationnJob counter;int amt;
	
	synchronized private static void run() {
		counter.BookTicket(500);
		counter.givechange();
	}
	synchronized private static void run1() {
		counter.BookTicket(1000);
		counter.givechange();
	}
	
	public static void main(String[] args) {
		//Thread t=Thread.currentThread();
		//t.setName("Sharjeel");
		
		ReservationnJob counter=new ReservationnJob();
		
		Thread wasee=new Thread(ThreadDemo3InMethodExp::run,"wasee");
		Thread shajju=new Thread(ThreadDemo3InMethodExp::run1,"shajju");
		wasee.start();
		shajju.start();
	}
}

class ReservationnJob {
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