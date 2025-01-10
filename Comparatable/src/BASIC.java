import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BASIC {
 public static void main(String args[] ) {
	 Comparator<String> in=(i,j)-> {
       return i.length()-j.length();
		
	 };
	 ArrayList<String> plane=new ArrayList<String>();
	 plane.add("Earthein");
	 plane.add("Sun");
	 plane.add("March");
     Collections.sort(plane,in);
     
     System.out.println(plane);
 }
}
