package basic;

import java.util.Scanner;

public class AreaTriangleDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the width of the triangle:");
	double width = scan.nextDouble();
	System.out.println("Enter the height of the triangle:");
	double height = scan.nextDouble();
	
	double area = (width*height)/2;
	System.out.println("Area of triangle is: " +area);
}
}
