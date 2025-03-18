package JFRAME_Basic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class myframe3 extends JFrame implements KeyListener{
	JLabel label;
	myframe3(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(240, 240);
		this.addKeyListener(this);
		
		label=new JLabel();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		//keypressed = Invoked when a physical key is pressed down,uses keycode,int output
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		//keyrealeased= called whenever a button is realesed
		System.out.println("you realeased a key:"+arg0.getKeyChar());
		System.out.println("you realeased a key:"+arg0.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// keytyped=Invoked when a key is typed, uses keychar,char output
		
	}
}
public class KeyListener_Java {

	public static void main(String[] args) {
		myframe3 obj=new myframe3();
		
	}

}
