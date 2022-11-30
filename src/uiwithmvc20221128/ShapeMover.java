package uiwithmvc20221128;

import java.util.ArrayList;
import java.util.Random;

public class ShapeMover {
	private ArrayList<Shape> shapes;
	private Random rnd;
	public ShapeMover(ArrayList<Shape> shapes) {
		this.shapes = shapes;
		rnd = new Random();
	}
	public void moveRandomly() {
		int dx, dy;
		for (Shape s : shapes) {
			dx = -10 + rnd.nextInt(20);
			dy = -10 + rnd.nextInt(20);
			s.setX(s.getX() + dx);
			s.setY(s.getY() + dy);
		}
	}
}
