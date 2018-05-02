import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
	JPanel InitTopPanel() {
		JPanel panel = new JPanel();
		JTextField textPeriod = new JTextField(5);
		JLabel labelPeriod = new JLabel("Input port : ");
		panel.add(labelPeriod);
		panel.add(textPeriod);
		panel.setLocation(10, 10);
		return panel;
	}
	JPanel InitBottomPanel() {
		JPanel panel = new JPanel();
		JButton bt_start = new JButton("Start");
		bt_start.setLocation(100, 100);
		panel.add(bt_start);
		return panel;
	}
	public Frame() {
		  super("Hongfrica TV Serve");
		   
		  setBounds(100 , 100 , 400 , 400);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Container contentPane = this.getContentPane();
		  
		  contentPane.add(InitTopPanel());
		  contentPane.add(InitBottomPanel());
		  
		  setVisible(true);
		 }
}
