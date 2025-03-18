package event_handling_java;

import java.awt.*;

import javax.swing.*;

class MyFrame_M extends JFrame{
	JPanel panel;
	MyFrame_M(){
		panel=new JPanel();
		panel.setBounds(0,0,300,300);
		this.add(panel);
	}
	public void My_Button(String name,Color c) {
		JButton button=new JButton(name);
		button.setForeground(c);
		panel.add(button);
		button.addActionListener(e->
		panel.setBackground(c));
	}
}
public class Button_With_Method {

	public static void main(String[] args) {
		MyFrame_M frame=new MyFrame_M();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.setVisible(true);
	    frame.My_Button("Yellow", Color.CYAN);
	    frame.My_Button("Blue",Color.BLUE);

	}

}
