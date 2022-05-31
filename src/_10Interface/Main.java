package _10Interface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length for area of rectangle: ");
		int length = scanner.nextInt();
		
		System.out.println("Enter breadth for area of rectangle: ");
		int breadth = scanner.nextInt();
		
		Shape shape = new Area();
		int a =  shape.rectangleArea(length, breadth);
		System.out.println("The area of rectangle is: "+a);
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter side for square:");
		int side = scanner.nextInt();
		int s = shape.squareArea(side);
		System.out.println("The area of square is: "+s);
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter radius fro circle: ");
		int radius = scanner.nextInt();
		int r = shape.circleArea(radius);
		System.out.println("The area of circle is: "+r);
		System.out.println("-----------------------------------------");
		scanner.close();
	}
}
