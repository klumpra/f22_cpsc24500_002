package uiwithmvc20221128;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(100,50,75));
		shapes.add(new Circle(200,100,50));
		shapes.add(new Rectangle(50,150,100,50));
		for (Shape s : shapes) {
			System.out.println(s);
		}
		ShapeFrame frm = new ShapeFrame(shapes);
		frm.setVisible(true);
	}
}
