import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class Myframe extends JFrame implements ActionListener{
	JButton button;
	JTextField text1,text2;
	
	Myframe(){
		 button=new JButton("Click here");
		 text1=new JTextField();
		 text2=new JTextField();
		 button.setBounds(100, 100, 100, 100);
		 text1.setBounds(50, 50, 300, 50);
		 text2.setBounds(50, 200, 300, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.add(text1);
		this.add(text2);
		this.add(button);
		button.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		String s=text1.getText();
		int c=0;
		char[] name=s.toCharArray();
		for(int i=0;i<name.length;i++) {
			if(name[i]=='a'|| name[i]=='e'|| name[i]=='i'|| name[i]=='o'|| name[i]=='u') {
				c++;
			}
		}
		text2.setText("The number of  vowels: "+c);
		
	}
	
}
public class Problem1 {

	public static void main(String[] args) {
		Myframe frame=new Myframe();

	}

}
