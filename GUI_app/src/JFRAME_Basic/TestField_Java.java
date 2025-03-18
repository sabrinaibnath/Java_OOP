package JFRAME_Basic;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestField_Java extends JFrame {
	JFrame frame=new JFrame();
	JTextField testg=new JTextField();
        TestField_Java(){
        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	testg.setPreferredSize(new Dimension(250,40));
        	testg.setBounds(0, 0, 250, 40);
        	this.add(testg);
        	this.setVisible(true);
        	this.pack();
        }
	

}
