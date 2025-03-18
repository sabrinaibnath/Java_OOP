package JFRAME_Basic;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame6 extends JFrame implements ActionListener{
	
	JRadioButton Pbutton,Hbutton,Hobutton;
	ButtonGroup button;
	MyFrame6(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(new FlowLayout());
		
		
		Pbutton=new JRadioButton("Pizza");
		Hbutton=new JRadioButton("hamburger");
		Hobutton=new JRadioButton("hotdog");
		button=new ButtonGroup();
		
		button.add(Pbutton);
		button.add(Hbutton);
		button.add(Hobutton);
		
		Pbutton.addActionListener(this);
		Hbutton.addActionListener(this);
		Hobutton.addActionListener(this);
		this.add(Hbutton);
		this.add(Pbutton);
		this.add(Hobutton);
		this.setVisible(true);
		//if we want to set image then after importing image through ImageeIcon we need to do Pbutton.setIcon(the image variable)  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Pbutton) {
		System.out.println("It's a pizza");
		}
		if(e.getSource()==Hbutton) {
			System.out.println("It's a HamBurger");
			}
		if(e.getSource()==Hobutton) {
			System.out.println("It's a Hotdog");
			}
		
	}
}
public class Radio_Button_Java {

	public static void main(String[] args) {
		MyFrame6 frame=new MyFrame6();
		
	}

}
