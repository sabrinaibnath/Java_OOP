package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe_o extends Frame{
	TextArea t;
	Myframe_o(){
		t=new TextArea("Computer Science And Engineering Department");
		add(t);
	}
}
public class Text_Area_Java {

	public static void main(String[] args) {
		Myframe_o frame=new Myframe_o();
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
