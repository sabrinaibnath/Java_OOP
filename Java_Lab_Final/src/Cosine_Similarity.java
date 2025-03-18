import java.util.*;

public class Cosine_Similarity {

	public static void main(String[] args) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		s2=in.nextLine();
		
		String[] arr1=s1.split(" ");
		String[] arr2=s2.split(" ");
		
		LinkedHashSet<String>unique=new LinkedHashSet<>();
		LinkedHashMap<String,Integer>D1=new LinkedHashMap<>();
		LinkedHashMap<String,Integer>D2=new LinkedHashMap<>();
		
		ArrayList<Integer>k=new ArrayList<>();
		ArrayList<Integer>k1=new ArrayList<>();
		
		for(String word1:arr1) {
			unique.add(word1);
		}
		for(String word1:arr2) {
			unique.add(word1);
		}
		//System.out.print(unique);
		
		for(String word:unique) {
			for(String num:arr1) {
				if(!word.equals(num)) {
					D1.put(word,D1.getOrDefault(word,0));
				}
				else {
					D1.put(word,D1.getOrDefault(word, 0)+1);
				}
			}
		}
		
		for(String word:unique) {
			for(String num:arr2) {
				if(!word.equals(num)) {
					D2.put(word,D2.getOrDefault(word,0));
				}
				else {
					D2.put(word,D2.getOrDefault(word, 0)+1);
				}
			}
		}

		System.out.println(D1);
		System.out.println(D2);
		
		for(Integer h:D1.values()) {
			k.add(h);
		}
		
		for(Integer h:D2.values()) {
			k1.add(h);
		}
		
		//System.out.println(k);
		//System.out.println(k1);
		int dot=0;
		int mag1=0,mag2=0;
		for(int i=0;i<k.size();i++) {
			dot+=k.get(i)*k1.get(i);
		}
		
		for(int i=0;i<k.size();i++) {
			mag1+=k.get(i)*k.get(i);
		}
		for(int i=0;i<k1.size();i++) {
			mag2+=k1.get(i)*k1.get(i);
		}
		double magg1=(double)Math.sqrt(mag1);
		double magg2=(double)Math.sqrt(mag2);
		
		double dow=magg1*magg2;
		double re1= dot/dow;
		
		double re=Math.acos(re1);
		double r=re*(180/3.1416);
		
		System.out.println(r);
		
		in.close();
	}

}
