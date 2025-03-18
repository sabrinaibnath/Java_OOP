import java.util.HashMap;

public class Copy_One_Hash_To_Another {

	public static void main(String[] args) {
	   HashMap<String,Integer>HashMap1=new HashMap<>();
	   HashMap<String,Integer>HashMap2=new HashMap<>();
	   
	   HashMap1.put("A",1);
	   HashMap1.put("B",2);
	   HashMap1.put("C",3);
	   
	   HashMap2.putAll(HashMap1);
	   
	   System.out.println(HashMap1+"\n"+HashMap2);
	}

}
