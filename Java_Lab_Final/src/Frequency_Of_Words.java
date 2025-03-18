import java.util.*;

public class Frequency_Of_Words {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		String[] arr=s.split(" ");
		
		
		TreeMap<String,Integer>fre=new TreeMap<>();
		for(int i=0;i<arr.length;i++) {
		   if(!fre.containsKey(arr[i])) {
			   fre.put(arr[i],1);
		   }
		   else {
			   fre.put(arr[i],fre.getOrDefault(arr[i],1)+1);
		   }
		}
	    System.out.println(fre);
	    
	    in.close();
	}

}
