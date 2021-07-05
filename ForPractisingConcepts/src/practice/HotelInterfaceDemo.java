package practice;

public class HotelInterfaceDemo {
public static void main(String[] args) {
	SharjeelHotel hotel=new SharjeelHotel();
	hotel.uniform();
	hotel.docooking();
	hotel.doserving();
	hotel.docharging();
	
}
}
interface Charminar{
	public void uniform();
	
}
interface Cooking{
public void docooking();
}
interface Serving{
	public void doserving();
}
interface Charge{
	int i=50;
	public void docharging();
	}
class SharjeelHotel implements Charminar,Cooking,Serving,Charge{
	
	public void uniform() {
		// TODO Auto-generated method stub
		System.out.println("The Uniform should be as per rule of Charminar Hotel");
	}
	@Override
	public void docooking() {
		System.out.println("Cooking is getting Done");
		
	}

	@Override
	public void doserving() {
		// TODO Auto-generated method stub
		System.out.println("The food is served");
		
	}

	@Override
	public void docharging() {
		// TODO Auto-generated method stub
		System.out.println("The payment is charged for Rs.."+i);
		
	}	
}