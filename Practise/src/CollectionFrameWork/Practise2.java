package CollectionFrameWork;

import java.util.*;


public class Practise2 {
	public static void main(String args[]) {
		String s1,s2;
		Scanner inp=new Scanner(System.in);
		s1=inp.nextLine();
		s2=inp.nextLine();
	
		List<String>l1=new ArrayList<>();
		List<String>l2=new ArrayList<>();
		List<String>l3=new ArrayList<>();
		List<String>l4=new ArrayList<>();
		
		String[] N=s1.split(" ");
		String[] M=s2.split(" ");
		
		for(int i=0;i<N.length;i++) {
			l1.add(N[i]);
		}
		for(int i=0;i<M.length;i++) {
			l2.add(M[i]);
		}
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		
		Set<String>myset=new TreeSet<>();
		for(String f:l1) {
			myset.add(f);
		}
		for(String g:l2) {
			myset.add(g);
		}
		System.out.println(myset);
		System.out.println(l1);
		System.out.println(l2);
		for(String o:l1) {
			for(String l:l2) {
				if(o.equals(l)) {
					l3.add(o);
				}
			}
		}
		System.out.println(l3);
		int count1=myset.size();
		int count2=l3.size();
		double result=(double)count2/count1;
		System.out.println(result);
;				
	}
	
}
