package Project;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SelectMode {
	
	SelectMode(){
		JFrame frame = new JFrame("SELECT MODE REACHABILITY");
	    frame.setSize(400, 400);
	    frame.setVisible(true);
	    frame.setLayout(new FlowLayout());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JButton b = new JButton("REACHABILITY");
	    JButton c = new JButton("MODE REACHABILITY");
	    JButton e = new JButton("DEAD END");
	    frame.add(b);
	    frame.add(c);
	    frame.add(e);
	    
	    ActionListener MoveToSpecific = new ActionListener()
	    {
	      public void actionPerformed(ActionEvent actionEvent) {
	        new SwingAdminGui();
	      }
	    };
	    
	    ActionListener MoveToSpecific1 = new ActionListener()
	    {
	      public void actionPerformed(ActionEvent actionEvent) {
	        new SwingAdminGui();
	      }
	    };
	    
	    ActionListener MoveToSpecific2 = new ActionListener()
	    {
	      public void actionPerformed(ActionEvent actionEvent) {
	        new SwingAdminGui();
	      }
	    };
	    
	    b.addActionListener(MoveToSpecific);
	    c.addActionListener(MoveToSpecific1);
	    e.addActionListener(MoveToSpecific2);
	    
	}



}
