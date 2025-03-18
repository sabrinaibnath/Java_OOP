package Displying_Info_In_Component;

import java.awt.*;

import javax.swing.*;

class myp extends JPanel{
	myp(){
		this.setSize(new Dimension(200,200));
		
	}
	public void paint(Graphics g) {
		Graphics2D g2d;
		g2d=(Graphics2D)g;
		g2d.drawRect(100, 100, 200, 150);
		g2d.drawOval(100, 100, 200, 150);
		g2d.drawLine(100, 100,300, 250);
		g2d.drawOval(48, 30, 300, 300);
		Font d=new Font("Serif",Font.BOLD,20);
		g2d.setFont(d);
		g2d.drawString("HI World", 400, 400);
	}
}
class myf extends JFrame{
	myp panel;
	myf(){
		panel=new myp();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLocationRelativeTo(null);
		this.add(panel);
		this.setVisible(true);
		
	}
}
public class Draw_Rec_elleips_oval_dia {

	public static void main(String[] args) {
		myf frame=new myf();
	}

}
