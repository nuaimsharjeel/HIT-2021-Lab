package practice;

public class CalculationUsingInheritance {
public static void main(String[] args) {
	Addition add=new Addition();
	Subtraction sub = new Subtraction();
	Multiplication mul=new Multiplication();
	add.addition(10, 5);
	sub.subtraction(10, 5);
	mul.multiplication(10, 5);
}
}
abstract class calculation{
	public void calculate() {
		System.out.println("The Calculation is Done");
	}
}
class Addition extends calculation{
	public void addition(int i,int j) {
	int k=i+j;
	System.out.println("The Addition of two numbers is.. "+k);
	}
}
class Subtraction extends calculation{
	public void subtraction(int i,int j) {
	int k=i-j;
	System.out.println("The subtraction of two numbers is.. "+k);
	}
}
class Multiplication extends calculation{
	public void multiplication(int i,int j) {
	int k=i*j;
	System.out.println("The multiplication of two numbers is.. "+k);
	super.calculate();
	}
}
