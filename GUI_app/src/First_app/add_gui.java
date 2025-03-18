package First_app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class addition extends JFrame implements ActionListener{
	int hight,wid;
	JTextField t1=new JTextField(20);
	JTextField t2=new JTextField(20);
	JButton b=new JButton("ok");
	JLabel l1=new JLabel("result");
	addition(int h, int w ){
		hight=h;
		wid=w;
	
	b.addActionListener(this);
	add(t1);
	add(t2);
	add(b);
	add(l1);
	setLayout(new FlowLayout());//it is changing the default layout which is card layout
	setVisible(true);//this line confirms if the jframe is visible 
	setSize(wid,hight);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
public void actionPerformed(ActionEvent ae) {	
	int num1=Integer.parseInt(t1.getText());
	int num2=Integer.parseInt(t2.getText());
	int value=num1+num2;
	l1.setText(value+" ");
}
}
public class add_gui {

	public static void main(String[] args) {
		int hight,wid;
		Scanner in=new Scanner(System.in);
		hight=in.nextInt();
		wid=in.nextInt();
	addition obj=new addition(hight,wid);
	

	}

}
