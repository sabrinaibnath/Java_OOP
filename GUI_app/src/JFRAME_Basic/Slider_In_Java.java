package JFRAME_Basic;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Myframe8 implements ChangeListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	Myframe8(){
		frame=new JFrame("SLider Demo");
		panel=new JPanel();
		label=new JLabel();
		slider=new JSlider(0,100,50);//we are creating a slider with number minimum0 to maximum100
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setFont(new Font("Serif",Font.BOLD,20));
		slider.setOrientation(SwingConstants.VERTICAL);//this will set the slider in the verticle line
		
		slider.setPaintLabels(true);
		label.setFont(new Font("Serif",Font.BOLD,10));
		label.setText("Clecius"+slider.getValue());
		slider.addChangeListener(this);
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		label.setText("Clecius"+slider.getValue());
		
	}
}
public class Slider_In_Java {

	public static void main(String[] args) {
		Myframe8 fram=new Myframe8();
	}

}
