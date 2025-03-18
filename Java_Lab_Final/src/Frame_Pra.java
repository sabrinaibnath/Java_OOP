import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JTextField text1,text2;
	MyFrame(){
		button=new JButton("Click here");
		text1=new JTextField();
		text2=new JTextField();
		
		text1.setBounds(30, 0, 200, 50);
		button.setBounds(50, 50, 80, 50);
		text2.setBounds(30, 100, 200, 50);
		
		button.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.add(button);
		this.add(text1);
		this.add(text2);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String s=text1.getText();
			char[] arr=s.toCharArray();
			int c=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') {
				c++;	
				}
			}
			text2.setText(c+" There are this vowels");
		}
		
	}
}
public class Frame_Pra {

	public static void main(String[] args) {
	MyFrame obj=new MyFrame();
	}

}
