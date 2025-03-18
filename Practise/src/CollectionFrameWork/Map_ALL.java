package CollectionFrameWork;

import java.util.*;

public class Map_ALL {

	public static void main(String[] args) {
	Map<String,Integer>mymap=new HashMap<String,Integer>();
	mymap.put("Avacado", 60);
	mymap.put("Mango", 80);
	mymap.put("Lemon", 90);
	mymap.put("Nomeal", 50);
	
	System.out.println(mymap);
	for(String mapkey:mymap.keySet()) {
		System.out.println(mapkey);
	}
	for(String mapkey1:mymap.keySet()) {
		System.out.println(mymap.get(mapkey1));//grt(key) return the value of the key
	}
	
	}

}
