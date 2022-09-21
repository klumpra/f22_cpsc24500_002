package circleappv1;
// this application takes in a radius from the user and
// computes the area and circumference
import java.util.Scanner;
public class CircleApp {
	public static double calcArea(double radius) {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}
	public static double calcCircumference(double radius) {
		double circ;
		circ = 2 * Math.PI * radius;
		return circ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius;
		radius = sc.nextDouble();
		double area, circumference;
		area = calcArea(radius);
		circumference = calcCircumference(radius);
		System.out.printf("A circle with radius %.2f has an area of %.2f and a circumference of %.2f.\n", 
				radius,area,circumference);
	}
}
