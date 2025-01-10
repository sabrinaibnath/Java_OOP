package Map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cosine_similarity {

	public static void main(String[] args) {
		//taking input from the user
		Scanner inp=new Scanner(System.in);
		String s1,s2;
		s1=inp.nextLine();
		s2=inp.nextLine();
		
		//creating new collections
		Set<String>s=new TreeSet<>();
		
		LinkedList<String> l1,l2;
		l1=new LinkedList<>();
		l2=new LinkedList<>();
		
		Map<String,Integer> m1,m2;
		m1=new TreeMap<String,Integer>();
		m2=new TreeMap<String,Integer>();
		
		ArrayList<Integer>l4,l5;
		l4=new ArrayList<>();
		l5=new ArrayList<>();
		
		double dot=0.0,mag1=0.0,mag2=0.0;
		
		//Splitting the strings 
		String[] Split1=s1.split(" ");
		String[] split2=s2.split(" ");
		
		for(String num:Split1) {
			l1.add(num);
		}
		
		for(String num:split2) {
			l2.add(num);
		}
		
		for(String k:l1) {
			s.add(k);
		}
		for(String g:l2) {
			s.add(g);
		}
		
		for(String word : s) {
			for(String num : l1) {
				if(!word.equals(num)) {
					m1.put(word,m1.getOrDefault(word,0));
				}
				else {
					m1.put(word,m1.getOrDefault(word,0)+1);
				}
			}
		}
			

			for(String word1:s) {
				for(String num:l2) {
					if(!word1.equals(num)) {
						m2.put(word1, m2.getOrDefault(word1, 0));
						
					}
					else {
						m2.put(word1,m2.getOrDefault(word1,0)+1);
					}
				}
			}
			
			for(Map.Entry<String,Integer>entry:m1.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
				l4.add(entry.getValue());
			}
			
			for(Map.Entry<String,Integer>entry:m2.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
				l5.add(entry.getValue());
			}
			
			for(int i=0;i<l4.size();i++) {
				dot=dot+(l4.get(i)*l5.get(i));
				mag1=mag1+(l4.get(i)*l4.get(i));
				mag2=mag2+(l5.get(i)*l5.get(i));
			}
			double magnitude1=Math.sqrt(mag1);
			double magnitude2=Math.sqrt(mag2);
			double below=magnitude1*magnitude2;
			
			if(below==0) {
				System.out.println("undefined");
			}
			else {
				double re=(dot)/(below);
				System.out.println(re);
				System.out.println(Math.acos(re)*(180/3.1416));
			}
			inp.close();
		}
	}

