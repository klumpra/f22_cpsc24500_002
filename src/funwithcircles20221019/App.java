package funwithcircles20221019;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, rad;
		System.out.print("Enter x, y, and radius: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		rad = sc.nextDouble();
		Circle c = new Circle(x,y,rad);
		c.setRadius(2*c.getRadius()); // double the radius
		double area = c.findArea();
		double circumference = c.findCircumference();
		System.out.printf("Area = %.2f, Circ = %.2f\n", area, circumference);
		System.out.println("Here is a full description: ");
		System.out.println(c);
		
	}

}
