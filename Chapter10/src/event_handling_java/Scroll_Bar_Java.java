package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myframej extends Frame{
	Scrollbar bar,bar2,abr3;
	String s=" ";
	myframej(){
		bar=new Scrollbar(0,20,10,1,225);//bar = new Scrollbar(orientation, value, visible, minimum, maximum);
        bar2=new Scrollbar(1,20,10,1,225);
        abr3=new Scrollbar(0,20,10,1,225);
        add(bar);
        add(bar2);
        add(abr3);
	}
}
public class Scroll_Bar_Java {

	public static void main(String[] args) {
		myframej frame=new myframej();
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			System.exit(0);	
			}
		});
	}

}
