import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;



class MouseDemo extends Frame implements MouseListener{
	int wid,hi;
	String s;
	MouseDemo(int h,int w){
		hi=h;
		wid=w;
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent ae) {
		s="mouse Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent ae) {
		s="mouse Pressed";
		repaint();
	}
	public void mouseEntered(MouseEvent ae) {
		s="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent ae) {
		s="mouse Exited";
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		s="mouse Released";
		repaint();	
	}
	public void paint(Graphics g) {
		g.drawString(s, hi, wid);
		
	}
	
}
public class MouseEventsExmple {

	public static void main(String[] args) {
		int hight,wid;
		Scanner inp=new Scanner(System.in);
		hight=inp.nextInt();
		wid=inp.nextInt();
		MouseDemo obj=new MouseDemo(hight,wid);
		obj.setVisible(true);
		obj.setSize(hight,wid);
		obj.setTitle("Mouse Event");
		obj.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
	}

}
