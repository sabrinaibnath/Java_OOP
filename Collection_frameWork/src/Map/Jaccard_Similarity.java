package Map;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Jaccard_Similarity {

	public static void main(String[] args) {
		String s1,s2;
		Scanner inp=new Scanner(System.in);
		s1=inp.nextLine();
		s2=inp.nextLine();
		LinkedList<String>l1,l2,l3,l4;
		l1=new LinkedList<>();
		l2=new LinkedList<>();
		l3=new LinkedList<>();
		l4=new LinkedList<>();
		String[] split1=s1.split(" ", 10);
		String[] split2=s2.split(" ", 10);
		for(String num:split1) {
			l1.add(num);
		}
		
		for(String word:split2) {
			l2.add(word);
		}
		
		Collections.sort(l1);
		Collections.sort(l2);
		l3.addAll(l1);
		l3.addAll(l2);
		Set<String>unique=new LinkedHashSet<>(l3);
		
		int size=unique.size();
		System.out.println(size);
		
		int count=0;
		for(String word:l1) {
			for(String num:l2) {
				if(word.equals(num)) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		System.out.println(((double)count)/((double)size));

	}

}
