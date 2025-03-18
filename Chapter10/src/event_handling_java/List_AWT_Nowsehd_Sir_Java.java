package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Myframe_no extends Frame{
	List l;
	String s=" ";
	Myframe_no(){
		l=new List(2,true);//here 2 means 2 rows and true means we can select multiple item
		l.add("Horse");
		l.add("Moncha");
		add(l);
	}
}
public class List_AWT_Nowsehd_Sir_Java {

	public static void main(String[] args) {
		Myframe_no frame=new Myframe_no();
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );

	}

}
