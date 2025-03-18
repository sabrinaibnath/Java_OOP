import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Print_All_Duplicate_Char_In_A_String {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		
		
		char[] arr=s.toCharArray();
		LinkedHashMap<Character,Integer>m=new LinkedHashMap<>();
		
		for(char c:arr) {
			m.put(c, m.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer>entry:m.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		in.close();
	}

}
