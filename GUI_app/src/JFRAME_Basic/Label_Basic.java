package JFRAME_Basic;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Label_Basic {

	public static void main(String[] args) {
		JLabel label=new JLabel();//create a label
		label.setText("Hey,This is the first Label");//set test of label
		ImageIcon image=new ImageIcon("C:/Users/Acer/Downloads/dude.jpg");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);//set test left,center,right of imageicon
		label.setVerticalTextPosition(JLabel.TOP);//set test Top,center,bottom of imageicon
		label.setForeground(new Color(0x00FF00));//set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
		label.setIconTextGap(10);//set gap of text to image
		label.setBackground(Color.BLACK);//set background color
		label.setOpaque(true);//display background color
		
		Border border=BorderFactory.createLineBorder(Color.DARK_GRAY,20);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);//set vertical posisition of icon plus text
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100, 100, 250, 250);//set x,y posistion within frame as well as label
		JFrame frame=new JFrame();
		frame.setVisible(true);
		//frame.setSize(1020, 1020);
		//frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.pack();//add all component then use pack() to pack

	}

}
