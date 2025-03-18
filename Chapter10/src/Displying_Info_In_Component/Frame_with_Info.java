package Displying_Info_In_Component;

import java.awt.Graphics;

import javax.swing.*;

public class Frame_with_Info {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		
		
		//JLabel label=new JLabel();
		//label.setText("Not A Hello,WOrld Programe");
		//label.setBounds(0, 0,420,420);
		//label.setHorizontalAlignment(SwingConstants.CENTER);//adding the text to the center
	    //label.setVerticalAlignment(SwingConstants.CENTER);//adding the text to the center
		//frame.add(label);
		
		//another way
		//create a custom component to paint the message
		JComponent comp=new JComponent() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				String me="NOT A HELLO, WORLD PROBLEM";
				g.drawString(me, 100, 100);
			}
		};
		frame.add(comp);
		frame.setVisible(true);
	}

}
