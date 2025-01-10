package Practice_Slide;

import java.util.HashMap;

public class Map_Example1 {

	public static void main(String[] args) {
	HashMap<String,Integer>mymap=new HashMap<>();
          mymap.put("Std1",60);
          mymap.put("Std2",70);
          mymap.put("Std3",80);
          mymap.put("Std4",90);
          
          System.out.println(mymap);
          
          System.out.println(mymap.get("Std1"));
          
          //for each loop
          for(String mapk:mymap.keySet()) {
        	  System.out.println(mapk);//will print the key
        	  System.out.println(mymap.get(mapk));
          }
	}

}
