package First_app;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Abc extends JFrame{
	int hight;
	int wid;
	String l,m;
	public Abc(int h,int w,String s,String b) {
		hight=h;
		wid=w;
		l=s;
		m=b;
		setLayout(new FlowLayout());//it is changing the default layout which is card layout
		setVisible(true);//this line confirms if the jframe is visible 
		setSize(wid,hight);// for set the size of layout
		JLabel i= new JLabel(l);//for setting label
		JLabel i2=new JLabel(m);
		add(i);
		add(i2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the number of exit on close is 3.it is used for closing windows
	}
}
public class First_code {

	public static void main(String[] args) {
		int hi,wi;
		String s,s2;
		Scanner in=new Scanner(System.in);
		hi=in.nextInt();
		wi=in.nextInt();
		in.nextLine();
		s=in.nextLine();
		s2=in.nextLine();
	Abc obj=new Abc(hi,wi,s,s2);
	}
}
