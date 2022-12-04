package drawingtool20221205;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawingFrame extends JFrame {
    private ArrayList<Dot> dots;
    private DrawingPanel dpan;
    public ArrayList<Dot> getDots() {
        return dots;
    }
    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }
    public void setupMenu() {
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu mnuFile = new JMenu("File");
        mbar.add(mnuFile);
        JMenuItem miOpen = new JMenuItem("Open");
        JMenuItem miSave = new JMenuItem("Save");
        JMenuItem miExit = new JMenuItem("Exit");
        mnuFile.add(miOpen);
        mnuFile.add(miSave);
        mnuFile.add(miExit);
        miOpen.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                    }
                }
        );
        miSave.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                    }
                }
        );
        miExit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                    }
                }
        );  
    }
    public void setupGUI() {
        setBounds(100,100,500,500);
        setTitle("Drawing Tool");
        setupMenu();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panSouth = new JPanel();
        JLabel lblSize = new JLabel("Size");
        JTextField txtSize = new JTextField(3);
        JButton btnSetSize = new JButton("Set Size");
        btnSetSize.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int size = Integer.parseInt(txtSize.getText());
                            if (size < 1) {
                                JOptionPane.showMessageDialog(null, "The size must be >= 1");
                            } else {
                                dpan.setDotSize(size);
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "The size must be an integer >= 1.");
                        }
                        txtSize.setText("");
                    }
                }
        );
        panSouth.setLayout(new FlowLayout());
        panSouth.add(lblSize);
        panSouth.add(txtSize);
        panSouth.add(btnSetSize);
        c.add(panSouth,BorderLayout.SOUTH);
        
        // todo: create the drawing panel. Give it the list of dots and the current drawing size. add to center section
        // DO THAT HERE
        dpan = new DrawingPanel(dots,5);
        c.add(dpan,BorderLayout.CENTER);

    }
    public DrawingFrame() {
    	// TODO: create the dots, call setupGUI(), and set the default close operation
    	// DO THAT HERE
        dots = new ArrayList<Dot>();
        setupGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
