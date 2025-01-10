package Map;

import java.util.HashMap;


import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class All_Operation_Of_Map {

	public static void main(String[] args) {
		//creating a map
		Map<String,Integer>mp=new HashMap<>();
		
		//adding value
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			int n=in.nextInt();
			in.nextLine();
			String m=in.nextLine();
			mp.put(m,n);
		}
		//accessing element
		//get by key
		int b=mp.get("Sabrina");
		System.out.println(b);
		//get by default value
		int df=mp.getOrDefault("subha",0);
		System.out.println(df);
		
		//iterating 
		//for each
		for(Map.Entry<String, Integer>en:mp.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		//Iterator
		Iterator<Map.Entry<String, Integer>>itr=mp.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer>entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println(mp.containsKey("A")); // Output: false
		System.out.println(mp.containsValue(3)); // Output: true


	}

}
