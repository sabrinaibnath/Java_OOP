package event_handling_java;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame9 extends JFrame implements ActionListener{
	ImageIcon image1,image2,iamge2;
	JButton button1,button2,button3;
	JLabel label;
	MyFrame9(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLayout(null);
		label=new JLabel();
		label.setBounds(0, 0, 500, 200);
		
		button1=new JButton("one");
		button2=new JButton("two");
		button3=new JButton("three");
		
		button1.setBounds(50, 50, 100, 50);
		button2.setBounds(160,50,100,50);
		button3.setBounds(270, 50,100,50);
	
		button1.setToolTipText("this will make the background black");
		button2.setToolTipText("this will make the background Blue");
		button3.setToolTipText("this will make the background gray");
		
		label.add(button1);
		label.add(button2);
		label.add(button3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			label.setBackground(Color.BLACK);
			label.setOpaque(true);
		}
		if(e.getSource()==button2) {
			label.setBackground(Color.BLUE);
			label.setOpaque(true);
		}
		if(e.getSource()==button3) {
			label.setBackground(Color.GRAY);
			label.setOpaque(true);
		}
		
	}
}
public class Button_Event_Handling {

	public static void main(String[] args) {
		MyFrame9 frame=new MyFrame9();
	}

}
