package event_handling_java;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class MyFrame5 extends Frame implements MouseListener{
	String meg="";
	MyFrame5(){
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		meg="mouse clicked";
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		meg="mouse entered";
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		meg="mouse exited";
		repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		meg="mouse pressed";
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		meg="mouse realsed";
		repaint();
		
	}

	public void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Mouse_Handling_Nowshed_sir {

	public static void main(String[] args) {
		MyFrame5 frame=new MyFrame5();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
		});
	}

}
