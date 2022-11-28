package uiwithmvc20221128;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapePanel extends JPanel {
	private ArrayList<Shape> shapes;
	public ShapePanel() {
		shapes = new ArrayList<Shape>();
	}
	public ShapePanel(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*
		int count = 1;
		for (Shape s : shapes) {
			g.drawString(s.toString(), 25, count * 25);
			count = count + 1;
		}
		*/
		String type;
		int x, y, radius, width, length;
		for (Shape s : shapes) {
			type = s.getType();
			x = s.getX();
			y = s.getY();
			if (type.equals("circle")) {
				radius = ((Circle)s).getRadius();
				g.drawOval(x, y, radius, radius);
			} else if (type.equals("rectangle")) {
				width = ((Rectangle)s).getWidth();
				length = ((Rectangle)s).getLength();
				g.drawRect(x, y, width, length);
			}
		}
	}
}
