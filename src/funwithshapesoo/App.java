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
		/*
		System.out.print("Let's write to a file. Enter filename: ");
		String fileName = sc.nextLine();
		if (ShapeWriter.writeToText(shapes, fileName)) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure!");
		}
		System.out.println("Now clear the list:");
		shapes.clear();
		ShapeWriter.writeToScreen(shapes);
		System.out.println("Now going to read them back in ...");
		shapes = ShapeReader.readFromText(fileName);
		ShapeWriter.writeToScreen(shapes);
		*/
		System.out.println("Now write to binary. Enter filename: ");
		String fileName = sc.nextLine();
		if (ShapeWriter.writeToBinary(shapes, fileName)) {
			System.out.println("Written to binary successfully!");
		} else {
			System.out.println("Boo. Hiss. Drats.");
		}
		ArrayList<Shape> read = ShapeReader.readFromBinary(fileName);
		ShapeWriter.writeToScreen(shapes);
	}
}
