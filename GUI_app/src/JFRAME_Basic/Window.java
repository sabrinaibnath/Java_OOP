package JFRAME_Basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame5 implements ActionListener{
	JFrame fr=new JFrame();
	JButton button=new JButton("New Winodw");
	MyFrame5(){
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(420,420);
		fr.setLayout(null);
		button.setBounds(100, 160, 200,40);
		button.addActionListener(this);
		fr.add(button);
		fr.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			NewWindow win=new NewWindow();
		}
		
	}
}
class NewWindow {
	JFrame ne=new JFrame();
	JLabel label=new JLabel();
	NewWindow(){
		ne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ne.setSize(420,420);
		ne.setLayout(null);
		label.setBounds(0, 0,100,100);
		label.setText("Hi");
		ne.add(label);
		ne.setVisible(true);
	}
}
public class Window {

	public static void main(String[] args) {
		MyFrame5 frame=new MyFrame5();

	}

}
