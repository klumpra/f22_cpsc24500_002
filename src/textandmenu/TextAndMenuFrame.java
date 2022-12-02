package textandmenu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAndMenuFrame extends JFrame {
	private Story story;
	private JTextArea tarStory;  // multiline space for text
	public void setupMenu() {
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		JMenu mnuFile = new JMenu("File");
		JMenu mnuTools = new JMenu("Tools");
		mbar.add(mnuFile);
		mbar.add(mnuTools);
		// set up the three mnuFile items
		JMenuItem miLoad = new JMenuItem("Load story");
		JMenuItem miSave = new JMenuItem("Save story");
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);  
					}
				}
		);
		mnuFile.add(miLoad);
		miLoad.addActionListener( 
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser chooser = new JFileChooser();
						File f;
						if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
							f = chooser.getSelectedFile();
							if (StoryReader.readFromText(f, story)) {
								repaint();
							} else {
								JOptionPane.showMessageDialog(null, "Could not load the story.");
							}
						}
					}
				}
		);
		mnuFile.add(miSave);
		miSave.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser chooser = new JFileChooser();
						File f;
						if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
							f = chooser.getSelectedFile();
							if (StoryWriter.writeToFile(story, f)) {
								JOptionPane.showMessageDialog(null, "Story was saved.");
							} else {
								JOptionPane.showMessageDialog(null, "Story could not be saved.");
							}
						}
					}
				}
		);
		mnuFile.add(miExit);
		// set up the one mnuTools item
		JMenuItem miClear = new JMenuItem("Clear");
		mnuTools.add(miClear);
		miClear.addActionListener(   
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						story.clearSentences();
						repaint();    // tells the frame to repaint itself, which in turn tells all components to paint themselves
					}
				}
		);
	}
	public void setupGUI() {
		setTitle("Text and Menu Frame");
		setBounds(100,100,600,400);
		setupMenu();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
//		tarStory = new JTextArea("Your story will go here!");
		tarStory = new JTextArea();
		tarStory.setEditable(false);
		c.add(tarStory,BorderLayout.CENTER);
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());  // left-to-right
		JLabel lblSentence = new JLabel("Enter sentence:");
		JTextField txtSentence = new JTextField(30);   // 30 lower case m's wide
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String text = txtSentence.getText();
						story.addSentence(text);
						txtSentence.setText("");
						repaint();  // calls the frame's paint function
					}
				}
		);
//		btnSubmit.setEnabled(false);
		panSouth.add(lblSentence);
		panSouth.add(txtSentence);
		panSouth.add(btnSubmit);
		c.add(panSouth,BorderLayout.SOUTH);
	}
	public TextAndMenuFrame(Story story) {
		this.story = story;
		setupGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {
		tarStory.setText(story.toString());
		super.paint(g);  // all the components will be told to repaint themselves
	}
}
