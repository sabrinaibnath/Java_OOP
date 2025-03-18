import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem5_Map_Frequancy_Of_String {

	public static void main(String[] args) {
		String mystr;
		Scanner in=new Scanner(System.in);
		System.out.println("PLease enter your String:");
		mystr=in.nextLine();
		
		String[] arr=mystr.split(" ");
		
		LinkedHashMap<String,Integer>mymap=new LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(mymap.containsKey(arr[i])==false) {
				mymap.put(arr[i], 1);
			}
			else {
				mymap.put(arr[i], mymap.get(arr[i])+1);
			}
		}
		for(Map.Entry<String, Integer>entry:mymap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
