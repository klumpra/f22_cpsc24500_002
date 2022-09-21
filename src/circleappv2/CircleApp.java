package circleappv2;

import java.util.Scanner;
public class CircleApp {
	public double calcArea(double radius) {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}
	public double calcCircumference(double radius) {
		double circ;
		circ = 2 * Math.PI * radius;
		return circ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius;
		radius = sc.nextDouble();
		CircleApp ca = new CircleApp();
		double area, circumference;
		area = ca.calcArea(radius);
		circumference = ca.calcCircumference(radius);
		System.out.printf("A circle with radius %.2f has an area of %.2f and a circumference of %.2f.\n", 
				radius,area,circumference);
	}
}