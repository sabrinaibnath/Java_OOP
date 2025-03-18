package JFRAME_Basic;

import java.awt.*;

import javax.swing.*;

public class FlowLayout_Java {

	public static void main(String[] args) {
		// FlowLayout=places components in a row,sized at their preferred size
		// if the horizontal space in the container is too small
		//the FlowLayout class uses the next available row
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		
		frame.setLayout(new FlowLayout(FlowLayout.LEADING,2,10));
		//we will create a panel and add all button on the panel and add the panel in the frame
		JPanel panel=new JPanel();
		panel.setSize(200,400);
		panel.setLayout(new FlowLayout());//the panel has flowlayout
		panel.setBackground(Color.GRAY);
		for(int i=1;i<=6;i++) {
		    panel.add(new JButton("i"));
		}
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		
	}

}
