package event_handling_java;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class myframe8 extends Frame implements WindowListener{
	String me="";
	myframe8(){
	    addWindowListener(this);
	    setSize(420,420);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("window is activeted");
		me="Activated";
		repaint();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("window is closed");
		me="closed";
		repaint();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("window is closing");
		me="closing";
		repaint();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("window is Deactiveted");
		me="DeActivated";
		repaint();
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("window is Deiconified");
		me="deiconified";
		repaint();
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("window is iconified");
		me="iconfied";
		repaint();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("window is opened");
		me="opned";
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(me, 150, 200);
	}
}
public class Window_Listener_Nowshed_sir_java {

	public static void main(String[] args) {
		myframe8 frame=new myframe8();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
