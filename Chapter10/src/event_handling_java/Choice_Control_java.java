package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe13 extends Frame{
	Choice c;
	Myframe13(){
		c=new Choice();
		c.add("Pizza");
		c.add("Hamburger");
		c.add("Hotdog");
		add(c);
	}
}
public class Choice_Control_java {

	public static void main(String[] args) {
		Myframe13 frame=new Myframe13();
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {	
		    	System.exit(0);
		    }
		
	});
	}
}
