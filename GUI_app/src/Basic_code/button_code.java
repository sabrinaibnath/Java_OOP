package Basic_code;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

class ButtonFrame extends JFrame implements ActionListener{
	int hi,wid;
	//Declared button variable
	JButton b1,b2,b3;
	
	ButtonFrame(int h,int w){
		hi=h;
		wid=w;
		setSize(h,w);
		setVisible(true);
		setLayout(new FlowLayout());
		
		//create button
		 b1=new JButton("yellow");
		 b2=new JButton("blue");
		 b3=new JButton("red");
		
		//associate button action
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//add button to frame
		add(b1);
		add(b2);
		add(b3);
		
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			getContentPane().setBackground(Color.YELLOW);// to change the background
		}
		if(ae.getSource()==b2) {
			getContentPane().setBackground(Color.BLUE);
		}
		if(ae.getSource()==b3) {
			getContentPane().setBackground(Color.RED);
		}
	}
}
public class button_code {

	public static void main(String[] args) {
		int h,w;
		Scanner inp=new Scanner(System.in);
		h=inp.nextInt();
		w=inp.nextInt();
		ButtonFrame obj= new ButtonFrame(h,w);
	}

}
