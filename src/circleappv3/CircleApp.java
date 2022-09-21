package circleappv3;

import java.util.Scanner;

class Circle {
	private double radius;
	public Circle() {  // default constructor
		radius = 0;  // a default circle will have a radius of 0
	}
	public Circle(double r) {  // non-default constructor
		radius = r;
	}
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	public double calcCircumference() {
		return 2 * Math.PI * radius;
	}
}

public class CircleApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius;
		radius = sc.nextDouble();
		Circle c = new Circle(radius);
		double area, circumference;
		area = c.calcArea();
		circumference = c.calcCircumference();
		System.out.printf("A circle with radius %.2f has an area of %.2f and a circumference of %.2f.\n", 
				radius,area,circumference);
	}
}