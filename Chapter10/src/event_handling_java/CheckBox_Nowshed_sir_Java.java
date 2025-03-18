package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfr extends Frame{
	Checkbox m,f,t;
	myfr(){
		m=new Checkbox("male");
		f=new Checkbox("female");
		t=new Checkbox();
		t.setLabel("transgender");
		add(m);
		add(f);
		add(t);
		
	}
}
public class CheckBox_Nowshed_sir_Java {

	public static void main(String[] args) {
		myfr frame=new myfr();
		frame.setLayout(new FlowLayout());
		frame.setSize(420,420);
		frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
	}

}
