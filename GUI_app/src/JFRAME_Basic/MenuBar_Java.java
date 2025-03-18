package JFRAME_Basic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class My_Frame extends JFrame implements ActionListener{
	JMenuBar MenuBar;
	JMenuItem L,S,E;
	JMenu File1,Edit1,Doty;
      My_Frame(){
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setSize(420,420);
    	  this.setLayout(new FlowLayout());
    	   MenuBar=new JMenuBar();
    	   
    	   File1=new JMenu("File");
    	   Edit1=new JMenu("Edit");
    	   Doty=new JMenu("Help");
    	   
    	   L=new JMenuItem("Option1");
    	   S=new JMenuItem("Option2");
    	   E=new JMenuItem("Option3");
    	   L.addActionListener(this);
    	   S.addActionListener(this);
    	   E.addActionListener(this);
    	   
    	    Doty.add(L); 
    	    Doty.add(S); 
    	    Doty.add(E); 
    	   MenuBar.add(File1);
    	   MenuBar.add(Edit1);
    	   MenuBar.add(Doty);
    	  this.setJMenuBar(MenuBar);
    	  this.setVisible(true);
      }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==L) {
			System.out.println("hi");
		}
		if(e.getSource()==S) {
			System.out.println("bye");
		}
		if(e.getSource()==E) {
			System.out.println("moye");
		}
		
	}
	
}
public class MenuBar_Java {

	public static void main(String[] args) {
	 My_Frame frame=new My_Frame();

	}

}
