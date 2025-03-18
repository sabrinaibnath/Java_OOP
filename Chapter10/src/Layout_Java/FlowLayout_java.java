package Layout_Java;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

class MyLayout1 extends JFrame{
	JLabel label1,label2,label3;
	MyLayout1(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		label1=new JLabel("this is 1st");
		label2=new JLabel("this is 2nd");
		label3=new JLabel("this is 3rd");
		label1.setBackground(Color.CYAN);
		label1.setOpaque(true);
		label2.setBackground(Color.LIGHT_GRAY);
		label2.setOpaque(true);
		label3.setBackground(Color.pink);
		label3.setOpaque(true);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.setVisible(true);
	}
}
public class FlowLayout_java {

	public static void main(String[] args) {
	MyLayout1 frame=new MyLayout1();
	}

}
