package JFRAME_Basic;

import java.awt.*;

import javax.swing.*;

public class Panel_Java {

	public static void main(String[] args) {
		//JPnael=a GUI that functions as a container to hold other component
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setLayout(null);
		
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.black);
		panel1.setBounds(0, 0, 250, 250);
		
		frame.add(panel1);//adding panel in the frame
		
		JLabel label=new JLabel();
		label.setText("Hi");
		label.setForeground(Color.WHITE);
		panel1.add(label);
	}

}
