package JFRAME_Basic;

import java.awt.*;

import javax.swing.*;
class Mypanel extends JPanel{
	Image image;
	Mypanel(){
		this.setPreferredSize(new Dimension(200,200));
		image=new ImageIcon("C://Users//Acer//OneDrive//Pictures//dude.jpg").getImage();
		
	}
		public void paint(Graphics g) {
			Graphics2D g2D;//created a 2d graphics variable
			g2D=(Graphics2D)g;//casting g into 2D graphics object
			g2D.setStroke(new BasicStroke(5));//this will change the width of the line
			g2D.setColor(Color.GRAY);//this will set the color of the line
			//g2D.drawLine(0, 0, 100,100);//this will draw a line but will overlap with panel
			//g2D.drawRect(5, 5, 100,50);//this will draw the rectangle
			//g2D.fillRect(90, 90, 100, 50);//this will draw a rectangle that is filled
			
			//g2D.drawOval(250, 250, 50, 50);//this will draw a circle
			//g2D.fillOval(350, 350, 50, 50);//this will draw a circle that is filled
			
			//g2D.fillArc(400, 400, 30, 30, 0,180);//this will draw an acr
			//g2D.fillArc(450, 450, 30, 30, 180,180);//this will draw the acr in 180,we can use fill or draw to achieve the things
			int[] xp= {150,250,350};
			int[] yp= {300,150,300};
			g2D.drawPolygon(xp, yp, 3);//this will draw a triangle
			g2D.setFont(new Font("Ink Free",Font.BOLD,20));//this is to custom the font(size is 20)
			g2D.drawString("you are beautiful", 400, 400);//this will draw a string on the panel
		    g2D.drawImage(image, 0, 0, null);//this will draw a image on the panel
		}
}
class Myframe_New extends JFrame{
	Mypanel panel;
	Myframe_New(){
		panel=new Mypanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(680,680);
		this.add(panel);
		this.setLocationRelativeTo(null);//this will set the frame on the center of the consol
		this.setVisible(true);
	}
	
}
public class Graphics_Java {

	public static void main(String[] args) {
		Myframe_New frame=new Myframe_New();

	}

}
