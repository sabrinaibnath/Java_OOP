package Practice_Slide;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class JS {

	public static void main(String[] args) {
		ArrayList<String>l1=new ArrayList<>(Arrays.asList("Data","is","the","new","oil","of","digital","economy"));
		ArrayList<String>l2=new ArrayList<>(Arrays.asList("Data","is","a","new","oil"));
		
		Collections.sort(l1);
		
		Collections.sort(l2);
		
		l1.addAll(l2);
		
		//System.out.println(l1);
		LinkedHashSet<String> s1=new LinkedHashSet<>();
		
		s1.addAll(l1);
		
		//System.out.println(s1);
		
		int low=s1.size();
		
		ArrayList<String>l3=new ArrayList<>(Arrays.asList("Data","is","the","new","oil","of","digital","economy"));
		ArrayList<String>l4=new ArrayList<>(Arrays.asList("Data","is","a","new","oil"));
		
		int v=0;
		for(String word1:l3) {
			for(String word2:l4) {
				if(word1.equals(word2)) {
					v++;
				}
			}
		}
		System.out.println((double)v/(double)low);
		
	}
}
