import java.util.*;

public class Occurance_Of_Word {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		
		String[] line=s.split(" ");
		
		HashMap<String,Integer>mymap=new HashMap<>();
		
		for(int i=0;i<line.length;i++) {
			if(!mymap.containsKey(line[i])) {
				mymap.put(line[i], 1);
			}
			else {
				mymap.put(line[i], mymap.getOrDefault(line[i],1)+1);
			}
		}
		System.out.println(mymap);
		
		in.close();
	}

}
