package buttongrid;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonGridPanel extends JPanel {
	public void setupGUI() {
		setLayout(new GridLayout(3,3));
		JButton btn;
		for (int i = 1; i <= 9; i++) {
			btn = new JButton(String.valueOf(i));
			add(btn);
		}
	}
	public ButtonGridPanel() {
		setupGUI();
	}
}
