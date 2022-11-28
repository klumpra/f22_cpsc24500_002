package uiwithmvc20221128;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapeFrame extends JFrame {
	public void setupGUI(ArrayList<Shape> shapes) {
		setTitle("Drawing Frame");
		setBounds(100,100,500,500);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JButton btnOK = new JButton("OK");
		c.add(btnOK,BorderLayout.SOUTH);
		ShapePanel panDrawing = new ShapePanel(shapes);
		c.add(panDrawing,BorderLayout.CENTER);
	}
	public ShapeFrame(ArrayList<Shape> shapes) {
		setupGUI(shapes);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
