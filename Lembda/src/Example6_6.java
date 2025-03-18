import java.util.*;

import javax.swing.*;
import javax.swing.Timer;



public class Example6_6 {

	public static void main(String[] args) {
		String[] plants=new String[8];
	    plants[0]="Jupiter";
	    plants[1]="Mercury";
	    plants[2]="Venus";
	    plants[3]="Earth";
	    plants[4]="Mars";
	    plants[5]="Saturn";
	    plants[6]="Urans";
	    plants[7]="Neptun";
	  
	    System.out.println(Arrays.toString(plants));
	    System.out.println("Sorted in dictionary order");
	    Arrays.sort(plants);
	    System.out.println(Arrays.toString(plants));
	    System.out.println("Sorted according to length");
	    Arrays.sort(plants,(i,j)->i.length()-j.length());
	    System.out.println(Arrays.toString(plants));
	    
     Timer t=new Timer(1000,i->
     System.out.println("the time is "+new Date()));
     t.start();
     JOptionPane.showMessageDialog(null,"Quit program?");
     System.exit(0);
	}

}
