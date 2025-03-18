package JFRAME_Basic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Myframe7 extends JFrame implements ActionListener{
	JComboBox box;
	Myframe7(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals= {"Doggy","Moncha","Lion"};
		box=new JComboBox(animals);
		this.add(box);
		box.addActionListener(this);
		//to add item we ca do the below thing
		box.addItem("Horse");
		//to add item in a specific index 
		box.insertItemAt("Bear", 4);
		//to remove item
		box.removeItem("Horse");
		//if we do remove all then it will remove everything
		//if we want interger then we need to pass Integer and same goes for primitive data type
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==box) {
			System.out.println(box.getSelectedItem());
		}
		
	}
}
public class Combo_Box_Java {

	public static void main(String[] args) {
		Myframe7 frame=new Myframe7();

	}

}
