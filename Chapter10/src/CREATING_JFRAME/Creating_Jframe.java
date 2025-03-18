package CREATING_JFRAME;

import javax.swing.JFrame;

public class Creating_Jframe {

	public static void main(String[] args) {
		JFrame frame=new JFrame();//created a frame;
		frame.setVisible(true);//this will show the frame;
		frame.setSize(240, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
