package Layout_Java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Mylayout2 extends Frame{
	Label label1,label2,label3;
	Mylayout2(){
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		label1=new Label("this is 1st");
		label2=new Label("this is 2nd");
		label3=new Label("this is 3rd");
		
		label1.setBackground(Color.GRAY);
		label2.setBackground(Color.BLUE);
		label3.setBackground(Color.MAGENTA);
		
		add(label1);
		add(label2);
		add(label3);
		
	}
}
public class FlowLayout_Java_Nowshed_sir {

	public static void main(String[] args) {
		Mylayout2 frame=new Mylayout2();
		frame.setVisible(true);
		frame.setSize(429,200);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		}

}
