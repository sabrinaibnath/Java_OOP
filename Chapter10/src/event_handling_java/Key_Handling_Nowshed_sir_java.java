package event_handling_java;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame7 extends Frame implements KeyListener{
	String me="",k;
	MyFrame7(){
		addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		me="key is pressed";
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		me="key is released";
		k=k+e.getKeyChar();
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		me="key is typed";
		repaint();
		
	}
	public void paint(Graphics g) {
		g.drawString(me, 100,50);
		g.drawString(k, 100, 100);
	}
}
public class Key_Handling_Nowshed_sir_java {

	public static void main(String[] args) {
		MyFrame7 frame=new MyFrame7();
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
