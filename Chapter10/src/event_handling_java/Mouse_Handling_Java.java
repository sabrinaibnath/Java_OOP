package event_handling_java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
class MyFrame4 extends JFrame implements MouseListener{
	JLabel panel;
	MyFrame4(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setLayout(null);
		panel=new JLabel();
		panel.setBounds(0, 0,100,100);
		panel.setBackground(Color.GRAY);
		panel.setOpaque(true);
		panel.addMouseListener(this);
		this.setLocationRelativeTo(null);
		this.add(panel);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		//System.out.println("mouse is clicked");
		panel.setText("mouse is clicked");
		panel.setBackground(Color.BLACK);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		//System.out.println("mouse is enterned");
		panel.setText("mouse is enterd");
		panel.setBackground(Color.YELLOW);
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		//System.out.println("mouse is exited");
		panel.setText("mouse is exited");
		panel.setBackground(Color.CYAN);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		//System.out.println("Mouse is pressed");
		panel.setText("mouse is pressed");
		panel.setBackground(Color.BLUE);
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//System.out.println("mouse is realesed");
		panel.setText("mouse is realsed");
		panel.setBackground(Color.PINK);
		
	}
}
public class Mouse_Handling_Java {

	public static void main(String[] args) {
		MyFrame4 frame=new MyFrame4();
		

	}

}
