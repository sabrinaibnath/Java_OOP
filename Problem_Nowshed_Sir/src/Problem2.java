import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Myframe2 extends JFrame implements ActionListener{
	JButton button;
	JTextField t1,t2;
	Myframe2(){
		button=new JButton("Click me");
		t1=new JTextField();
		t2=new JTextField();
		button.setBounds(100, 100, 100, 100);
		t1.setBounds(50, 50, 300, 50);
		t2.setBounds(50, 200, 300, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.add(button);
		this.add(t2);
		this.add(t1);
		button.addActionListener(this);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s=t1.getText();
		int c=Integer.parseInt(s);
		int sum=1;
		for(int i=c;i>0;i--) {
			sum=i*sum;
		}
		t2.setText("this is the result:"+sum);
		
	}
}
public class Problem2 {

	public static void main(String[] args) {
		Myframe2 frame=new Myframe2();

	}

}
