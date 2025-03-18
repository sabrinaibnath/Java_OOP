package CREATING_JFRAME;
import java.awt.Image;

import javax.swing.*;
class Myframe extends JFrame{
	 Myframe(){
		//When you create an instance of Myframe using new Myframe(), the constructor Myframe() is automatically called. This is where you set up the properties of the frame
		// if i don't use the constructor then jvm woun't know that i want to set this properties
		//that's why i need constructor or method, and this keyword don't work without constructor or method
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setBounds(100, 100, 420, 420);//This code places the frame 100 pixels from the left and 200 pixels from the top of the screen, with a width and height of 420 pixels each.
        //this is one way to set the icon;
	    ImageIcon image1 =new ImageIcon("C:/Users/Acer/OneDrive/Pictures/dude.jpg");
        //Image image=image1.getImage();
        //this.setIconImage(image);
        //another way is
	    this.setIconImage(image1.getImage());
	    this.setVisible(true);
	  
        
	}
}
public class Creating_frame_Extending_JFrame {

	public static void main(String[] args) {
		Myframe frame=new Myframe();
		
		
	}

}
