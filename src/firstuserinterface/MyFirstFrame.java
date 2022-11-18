package firstuserinterface;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame {
	public void setupGUI() {
		setTitle("My First Graphical User Interface");
		// left, top, width, tall  all in pixels
		setBounds(100,50,500,500);
		Container c = getContentPane();
		c.setBackground(Color.RED);
//		Color customColor = new Color(100,50,120);
//		c.setBackground(customColor);
/*
		c.setLayout(new FlowLayout());
		JLabel lblName = new JLabel("Enter your name: ");
		c.add(lblName);
		JTextField txtName = new JTextField(20);
		c.add(txtName);
		JButton btnOK = new JButton("Press me!");
		c.add(btnOK);
*/
		c.setLayout(new GridLayout(3,3));
		JButton btn;
		for (int i = 0; i < 9; i++) {
			btn = new JButton("OK");
			c.add(btn);
		}
	}
	public MyFirstFrame() {
		setupGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/*
	@Override
	public void paint(Graphics g) {
		super.paint(g);  // makes sure that the boundaries, background, and all contained components are rendered
		g.setColor(Color.GREEN);
		g.fillOval(100,50,150,75);
		g.setColor(Color.WHITE);
		g.drawRect(200, 200, 100, 200);
		g.setColor(Color.YELLOW);
		Font font = new Font("Arial",Font.BOLD+Font.ITALIC,72);
		g.setFont(font);
		g.drawString("Hello. It is Friday",100,400);
	}
	*/
}
