package First_app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class operation extends JFrame implements ActionListener
{
	int hight,wid;
	JTextField t1=new JTextField(15);
	JTextField t2=new JTextField(15);
	JButton b1=new JButton("addition");
	JButton b2=new JButton("substraction");
	JButton b3=new JButton("Multiplication");
	JButton b4=new JButton("division");
	JLabel l2=new JLabel("result");
	operation(int h,int w){
		hight=h;
		wid=w;
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l2);
		setLayout(new FlowLayout());//it is changing the default layout which is card layout
		setVisible(true);//this line confirms if the jframe is visible 
		setSize(wid,hight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		if(ae.getSource()==b1) {
			int value=n1+n2;
			l2.setText(value+" ");
		}
		else if(ae.getSource()==b2) {
			int v=n1-n2;
			l2.setText(v+" ");
		}
		else if(ae.getSource()==b3) {
			int v2=n1*n2;
			l2.setText(v2+" ");
		}
		else {
			if(n2!=0) {
			double v3=(double)n1/(double)n2;
			l2.setText(v3+" ");
		}
			else {
				System.out.println("denominator is 0");
			}
	}
	}
	
}
public class Calculator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int h,w;
		h=in.nextInt();
		w=in.nextInt();
		operation obj=new operation(h,w);

	}

}
