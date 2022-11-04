package funwithshapesoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		shapes.add(new Circle(7,3,5));
		shapes.add(new Rectangle(8,4,7,3));
		shapes.add(new Rectangle(0,2,10,5));
		shapes.add(new Circle(5,8,6));
		Collections.sort(shapes);
		ShapeWriter.writeToScreen(shapes);
		System.out.print("Let's write to a file. Enter filename: ");
		String fileName = sc.nextLine();
		if (ShapeWriter.writeToFile(shapes, fileName)) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure!");
		}
	}
}
