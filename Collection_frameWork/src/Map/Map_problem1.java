package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Map_problem1 {

	public static void main(String[] args) {
		Map<String,Integer>myMap=new TreeMap<String,Integer>();
		
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		inp.nextLine();
		for(int i=0;i<n;i++) {
			int l;
			String s;
			s=inp.nextLine();
			l=inp.nextInt();
			inp.nextLine();
			myMap.put(s,l);
			
		}
		
		for(Map.Entry<String,Integer>entry:myMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		inp.close();
		
	}

}
