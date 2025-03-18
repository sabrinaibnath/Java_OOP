package JFRAME_Basic;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class BorderLayour {
	public static void main(String[] args) {
		//borderlayout places component in five areas,North,South,West,East,Center
	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420, 420);
	frame.setVisible(true);
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel5=new JPanel();
	
	panel1.setBackground(Color.DARK_GRAY);
	panel2.setBackground(Color.pink);
	panel3.setBackground(Color.BLUE);
	panel4.setBackground(Color.GRAY);
	panel5.setBackground(Color.black);
	
	panel1.setPreferredSize(new Dimension(100,100));
	panel2.setPreferredSize(new Dimension(100,100));
	panel3.setPreferredSize(new Dimension(100,100));
	panel4.setPreferredSize(new Dimension(100,100));
	panel5.setPreferredSize(new Dimension(100,100));
	
	frame.add(panel1,BorderLayout.CENTER);
	frame.add(panel2,BorderLayout.WEST);
	frame.add(panel3,BorderLayout.EAST);
	frame.add(panel4,BorderLayout.NORTH);
	frame.add(panel5,BorderLayout.SOUTH);
	
	}

}
