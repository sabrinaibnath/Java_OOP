import java.util.*;

public class Comparing_a_List {

	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<>();
		ArrayList<Integer>l2=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			Integer n=in.nextInt();
			l1.add(n);
		}
		Integer i=Collections.min(l1);
		Integer k=Collections.max(l1);
		System.out.println(i);
		System.out.println(k);
		l1.remove(0);
		System.out.println(l1);
		
		l2.addAll(l1);
		l2.add(2,50);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		in.close();
		}
	
		
		
	}


