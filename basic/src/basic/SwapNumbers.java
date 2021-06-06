package basic;

public class SwapNumbers {
public static void main(String[] args) {
	int first = -120, second = 220;
	System.out.println("--Before Swap--");
	System.out.println("First Number =" +first);
	System.out.println("Second Number =" +second);
	
	first = first - second;
	second = first + second;
	first = second - first;
	
	System.out.println("--After Swap--");
	System.out.println("First Number =" +first);
	System.out.println("Second Number =" +second);

}
}
