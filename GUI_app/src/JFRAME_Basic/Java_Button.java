package JFRAME_Basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

class Myframe2 extends JFrame implements ActionListener{
	JButton buttonE;//declaring button objects
	
	Myframe2(){
		buttonE=new JButton();//creating button objects
		
		
		buttonE.setBounds(200, 100, 100, 50);//setting button's hight
		buttonE.setText("Hi");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.add(buttonE);//adding button with jframe
		
		buttonE.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent obj ) {
		if(obj.getSource()==buttonE) {
			System.out.println("poo");
		}
		
	}
}
public class Java_Button {

	public static void main(String[] args) {
		
		Myframe2 onj=new Myframe2();
	}

}
