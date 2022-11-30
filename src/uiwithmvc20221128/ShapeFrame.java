package uiwithmvc20221128;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ShapeFrame extends JFrame /*implements ActionListener*/ {
	private ArrayList<Shape> shapes;
	private ShapeMover mover;
	public void setupGUI(ArrayList<Shape> shapes) {
		this.shapes = shapes;
		mover = new ShapeMover(shapes);
		setTitle("Drawing Frame");
		setBounds(100,100,500,500);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JButton btnOK = new JButton("OK");
//		btnOK.addActionListener(this);
//		ButtonHandler bh = new ButtonHandler();
//		btnOK.addActionListener(bh);
		btnOK.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					/*
					for (Shape s : shapes) {
						s.setX(s.getX()+5);
						s.setY(s.getY()+5);
					}
					*/
					mover.moveRandomly();
					repaint();  // forces everything in the frame to re-render
				}
			}
		);
		c.add(btnOK,BorderLayout.SOUTH);
		ShapePanel panDrawing = new ShapePanel(shapes);
		c.add(panDrawing,BorderLayout.CENTER);
	}
	public ShapeFrame(ArrayList<Shape> shapes) {
		setupGUI(shapes);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/*
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "You clicked the button!");
	}
	*/
}
