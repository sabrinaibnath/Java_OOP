package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe14 extends Frame{
	Label l;
	TextField t;
	String s="";
	Myframe14(){
		l=new Label("Enter name");
		t=new TextField(35);
		add(l);
		add(t);
	}
}
public class Text_Field_Nowshed_Sir_java {

	public static void main(String[] args) {
		Myframe14 frame=new Myframe14();
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.addWindowListener(new WindowAdapter () {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
