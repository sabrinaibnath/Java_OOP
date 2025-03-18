package JFRAME_Basic;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame10 extends JFrame implements ActionListener {
	JButton button;
	JCheckBox box;
	ImageIcon image1,image2;
	MyFrame10(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		
		button=new JButton();
		button.addActionListener(this);
		box=new JCheckBox("I'am not a RObot");
		image1=new ImageIcon("C:/Users/Acer/Downloads/Correct.png");
		image2=new ImageIcon("C:/Users/Acer/Downloads/Cross.jpg");
		box.setIcon(image2);//this is the default icon
		box.setSelectedIcon(image1);//this will change the icon when we will select the box
		
		
		box.setFocusable(false);
		box.setFont(new Font("Serif",Font.BOLD,30));
		
		this.add(box);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
     if(arg0.getSource()==button) {
    	 System.out.println(box.isSelected());
     }
		
	}
}
public class JCheck_Box_Java {

	public static void main(String[] args) {
		MyFrame10 frame=new MyFrame10();

	}

}
