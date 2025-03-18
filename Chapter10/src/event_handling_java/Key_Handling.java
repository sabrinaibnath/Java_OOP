package event_handling_java;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class MyFrame6 extends JFrame implements KeyListener{
	JLabel label;
	ImageIcon image1,image2,image3;
 MyFrame6(){
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setSize(500,500);
	 label=new JLabel();
	 label.setBounds(0, 0, 400, 300);
	 label.setBackground(Color.PINK);
	 label.setOpaque(true);
	 image1=new ImageIcon("C:/Users/Acer/Downloads/Face_Fat.jpg");
	 image2=new ImageIcon("C:/Users/Acer/Downloads/Face_NO.jpg");
	 image3=new ImageIcon("C:/Users/Acer/Downloads/Face_ko.png");
	 this.setLayout(null);
	 this.add(label);
	 this.addKeyListener(this);
	 this.setVisible(true);
 }
	@Override
	public void keyPressed(KeyEvent arg0) {
		label.setText("Key is pressed");
		//label.setBackground(Color.BLUE);
		label.setIcon(image1);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		label.setText("key is realesed");
		//label.setBackground(Color.CYAN);
		label.setIcon(image2);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		label.setText("key is typed");
		//label.setBackground(Color.LIGHT_GRAY);
		label.setIcon(image3);
		
	}
	
}
public class Key_Handling {

	public static void main(String[] args) {
		MyFrame6 frame=new MyFrame6();
	}

}
