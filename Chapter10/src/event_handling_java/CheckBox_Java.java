package event_handling_java;

import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame11 extends JFrame{
	JCheckBox box1,box2,box3;
	MyFrame11(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		
		box1=new JCheckBox("Male");//creating a checkbox and setting text on it
		box2=new JCheckBox();
		box3=new JCheckBox();
		box2.setText("Female");//this is another way to set text
		box3.setText("Transgender");
		
		this.add(box1);
		this.add(box2);
		this.add(box3);
		this.setVisible(true);
	}
}
public class CheckBox_Java {

	public static void main(String[] args) {
		MyFrame11 frame=new MyFrame11();

	}

}
