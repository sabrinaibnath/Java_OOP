package List_linked;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Book_problem1 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList<String>();
		a.add("amy");
		a.add("carl");
		a.add("erica");
		
		LinkedList b = new LinkedList<String>();
		b.add("bob");
		b.add("dough");
		b.add("frances");
		b.add("gloria");
		
		ListIterator<String> it=a.listIterator();
		Iterator<String>itb=b.iterator();
		while(itb.hasNext()) {
			if(it.hasNext()) {
				it.next();
				it.add(itb.next());
			}
			
		}
		System.out.println(a);
		
	}

}
