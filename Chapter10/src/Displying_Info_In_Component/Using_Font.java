package Displying_Info_In_Component;

import java.awt.*;

import javax.swing.*;
class pan extends JPanel{
	pan(){
		this.setSize(new Dimension(200,200));
	}
	public void paint(Graphics g) {
		Graphics2D g1;
		g1=(Graphics2D)g;
		Font f=new Font("Serif",Font.BOLD,20);
		g1.setFont(f);
		int baseline=100;
		int x=50;
		String d="Hello,World!";
		FontMetrics me=g1.getFontMetrics(f);
		int wid=me.stringWidth(d);
		int h=me.getHeight();
		g1.drawRect(x-10, baseline-me.getAscent(),wid+12,h);;
		g1.drawString(d, x, baseline);
	}
}
class mp extends JFrame{
	pan panel;
	mp(){
		panel=new pan();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.add(panel);
		this.setVisible(true);
		
	}
}
public class Using_Font {

	public static void main(String[] args) {
	mp frame=new mp();

	}

}
