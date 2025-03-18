package event_handling_java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe12 extends Frame{
	Checkbox f,m,t;
	CheckboxGroup box;
	Myframe12(){
		box=new CheckboxGroup();
		f=new Checkbox("female",false,box);
		m=new Checkbox("male",false,box);
		t=new Checkbox("transgender",false,box);
		box.setSelectedCheckbox(f);
		add(m);
		add(f);
		add(t);
	}
}
public class CheckBoxGroup_Nowshed_sir_java {

	public static void main(String[] args) {
		Myframe12 frame=new Myframe12();
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
	});
	}

}
