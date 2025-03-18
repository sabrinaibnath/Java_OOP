import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Problem6_Map_CosineSimilarity {

	public static void main(String[] args) {
		//taking input from the user
		String str1, str2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter your Strings:");
		str1 = in.nextLine();
		str2 = in.nextLine();
		
		//Splitting the string
		String[] arr1=str1.split(" ");
		String[] arr2=str2.split(" ");
		
		//creating the data structure
		LinkedHashSet<String>myset = new LinkedHashSet<>();
		
		LinkedHashMap<String,Integer>mymap1=new LinkedHashMap<>();
		LinkedHashMap<String,Integer>mymap2=new LinkedHashMap<>();
		
		ArrayList<Integer>l1=new ArrayList<>();
		ArrayList<Integer>l2=new ArrayList<>();
		
		//storing all unique string in the set
		for(int i=0;i<arr1.length;i++) {
			myset.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			myset.add(arr2[i]);
		}
	  
		//Checking repeated word and keeping it in the map
	    for(String word:myset) {
	    	for(int i=0;i<arr1.length;i++) {
	    		if(!word.equals(arr1[i])) {
	    			mymap1.putIfAbsent(word, 0);
	    		}
	    		else {
	    			mymap1.put(word, mymap1.getOrDefault(word, 0)+1);
	    		}
	    	}
	    }
	    //System.out.println(mymap1);
	    //checking repeated word and keeping it in the map
	    for(String word:myset) {
	    	for(int i=0;i<arr2.length;i++) {
	    		if(!word.equals(arr2[i])) {
	    			mymap2.putIfAbsent(word, 0);
	    		}
	    		else {
	    			mymap2.put(word, mymap2.getOrDefault(word, 0)+1);
	    		}
	    	}
	    }
	    //System.out.println(mymap2);
	    //creating D1
	    for(Map.Entry<String,Integer>entry:mymap1.entrySet()) {
	    	l1.add(entry.getValue());
	    }
	    //creating D2
	    for(Map.Entry<String,Integer>entry:mymap2.entrySet()) {
	    	l2.add(entry.getValue());
	    }
	    //System.out.println(l1);
	    //System.out.println(l2);
	    
	    //finding the product
	    int product = 0;
	    for(int i = 0;i < l1.size(); i++) {
	    	
	    	product+=l1.get(i)*l2.get(i);
	    }
	   // System.out.println(product);
	    
	    //getting the square of D1 and D2
	    int mod1=0, mod2=0;
	    
	    for(int i=0;i<l1.size();i++) {
	    	
	    	mod1+=l1.get(i)*l1.get(i);
	    }
	    for(int i=0;i<l2.size();i++) {
	    	
	    	mod2+=l2.get(i)*l2.get(i);
	    }
	 //getting the sqrt of D1 and D2
	    double modula1, modula2;
	    
	    modula1=Math.sqrt((double)mod1);
	    
	    modula2=Math.sqrt((double)mod2);
	    
	    //System.out.println(modula1);
	    //System.out.println(modula2);
	    
	    //final calculating with the equation
	    
	    double ans1=(double)product/(modula1*modula2);
	    
	    double ans=Math.acos(ans1)*(180/3.1416);
	    
	    System.out.println(ans);
	    
	    in.close();
	}

}
