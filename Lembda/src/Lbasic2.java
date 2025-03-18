


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class myf extends JFrame implements ActionListener{
	JButton myb=new JButton("MyB");
	myf(){
		myb.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		myb.setBounds(100, 100, 100, 100);
		
		this.add(myb);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("u clicked a button");
		
	}
}
public class Lbasic2 {
 public static void main(String args[] ) {
	myf obj=new myf(); 
 
 }
}
