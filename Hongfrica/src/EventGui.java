import java.awt.*;
import javax.swing.*;
 

public class EventGui extends JFrame{
	private static final long serialVersionUID = -711163588504124217L;
	 
	 public EventGui() {
	  super("Event Firer");
	   
	  setBounds(100 , 100 , 400 , 400);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  Container contentPane = this.getContentPane();
	  
	  JPanel pane = new JPanel();
	  
	  JButton buttonStart = new JButton("Start");
	  buttonStart.setMnemonic('S');
	  JTextField textPeriod = new JTextField(5);
	  JLabel labelPeriod = new JLabel("Input port : ");
	  
	  buttonStart.setHorizontalAlignment(SwingConstants.CENTER);
	  buttonStart.setVerticalAlignment(SwingConstants.BOTTOM);
	  
	  pane.add(buttonStart);
	  pane.add(labelPeriod);
	  pane.add(textPeriod);
	  contentPane.add(pane);
	  
	  setVisible(true);
	 }
}
