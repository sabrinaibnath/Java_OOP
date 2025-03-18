package CollectionFrameWork;

import java.util.*;

public class Practise4 {

	public static void main(String[] args) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		s2=in.nextLine();
		
		String[] First=s1.split(" ");
		String[] Second=s2.split(" ");
		
		Map<String,Integer>mymap1=new TreeMap<String,Integer>();
		Map<String,Integer>mymap2=new TreeMap<String,Integer>();
		
		List<String>l1=new LinkedList<>();
		List<String>l2=new LinkedList<>();
	    ArrayList<Integer>l3=new ArrayList<>();
		ArrayList<Integer>l4=new ArrayList<>();
		
		for(int i=0;i<First.length;i++) {
			l1.add(First[i]);
		}
		for(int i=0;i<Second.length;i++) {
			l2.add(Second[i]);
		}
		
		Set<String>myset=new TreeSet<>();
		
		for(String f:l1) {
			myset.add(f);		
		}
		for(String f:l2) {
			myset.add(f);		
		}
		System.out.println(myset);
		

		for(String j:myset) {
			for(String h:l1) {
				if(!j.equals(h)) {
					mymap1.put(j,mymap1.getOrDefault(j,0));
				}
				else {
					mymap1.put(j,mymap1.getOrDefault(j,0)+1);
				}
			}
		}
		for(String j:myset) {
			for(String h:l2) {
				if(!j.equals(h)) {
					mymap2.put(j,mymap2.getOrDefault(j,0));
				}
				else {
					mymap2.put(j,mymap2.getOrDefault(j,0)+1);
				}
			}
		}
		//System.out.println(mymap1);
		//System.out.println(mymap2);
		
		for(Map.Entry<String,Integer>entry:mymap1.entrySet()) {
			l3.add(entry.getValue());
			}
		for(Map.Entry<String,Integer>entry:mymap2.entrySet()) {
			l4.add(entry.getValue());
			}
		System.out.println(l3);
		System.out.println(l4);
		double dot=0.0,l3e=0,l4e=0;
		for(int i=0;i<l3.size();i++) {{
				dot=dot+(l3.get(i)*l4.get(i));
			}
		}
		for(int i=0;i<l3.size();i++) {
			l3e=l3e+(l3.get(i)*l3.get(i));
		}
		for(int i=0;i<l4.size();i++) {
			l4e=l4e+(l4.get(i)*l4.get(i));
		}
		double r1=Math.sqrt(l3e*l4e);
		System.out.println(dot/r1);
	}

}
