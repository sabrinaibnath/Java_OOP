package JFRAME_Basic;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
class No extends JFrame implements WindowListener{
	No(){
		this.setLayout(null);
		this.setSize(420,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window is activated");
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Window is closed");
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Window is closing");
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Window is Deactivated");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Window is deiconified");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Window is iconified");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Window is opend");
		
	}
}
public class Window_Listener_Java {

	public static void main(String[] args) {
		No frame=new No();
	}

}
