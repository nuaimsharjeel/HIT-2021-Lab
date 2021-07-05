package practice;

public class HotelInterfaceDemo2 {
	public static void main(String[] args) {
		
		Sangeeta sangeeta=(String s)->{
			System.out.println("Uniform is..."+s);
		};
		sangeeta.uniform1("Red");
		
		Cooking1 cooking=()->{
			System.out.println("The food is cooking");
		};
		cooking.docooking1();
		
		Serving1 serving=()->{
			System.out.println("The food is served");
		};
		serving.doserving1();
		
		Charge1 charge=(int i)->{
			System.out.println("The food is of cost.."+i);
		};
		charge.docharging1(50);
	}
}
interface Sangeeta{
	public void uniform1(String s);
}
interface Cooking1{
	public void docooking1();
}
interface Serving1{
	public void doserving1();
}
interface Charge1{
	public void docharging1(int i);
}
