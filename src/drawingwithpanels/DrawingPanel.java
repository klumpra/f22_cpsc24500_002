package drawingwithpanels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	/*
	public void setupGUI() {
		
	}
	public DrawingPanel() {
		setupGUI();
	}
	*/
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);  // borders, background, and other components
		g.fillOval(100, 100, 50, 100);
		g.setColor(Color.RED);
		g.fillRect(50, 200, 200, 100);
		g.setColor(Color.BLUE);
		Font f = new Font("Comic Sans",Font.BOLD,72);
		g.setFont(f);
		g.drawString("Hello", 200, 200);
		
	}
}
