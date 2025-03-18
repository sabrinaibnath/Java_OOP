package JFRAME_Basic;

import java.awt.GridLayout;

import javax.swing.*;

public class GridLayout_Java {

	public static void main(String[] args) {
		// GridLayout=Places component in a grid of cells
		//Each component takes all the available space within its cell
		//and each cell is the same size
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(new GridLayout(3,3,2,2));//3 3 is the number of row and column and 2,2 is the horizontal and vertical spacing 
		
		frame.add(new JButton("1"));//adding button
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
		

	}

}
