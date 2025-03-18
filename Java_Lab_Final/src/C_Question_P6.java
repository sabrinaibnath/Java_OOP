import java.util.LinkedList;
import java.util.Scanner;

public class C_Question_P6 {

	public static void main(String[] args) {
		
	
		        String s1, s2;
		        Scanner in = new Scanner(System.in);
		        s1 = in.nextLine();
		        s2 = in.nextLine();
		        
		        char[] arr = s1.toCharArray();
		        char[] arr2 = s2.toCharArray();
		        int m = 0, n = 0, t = 0;
		        LinkedList<Character> l1 = new LinkedList<>();
		        LinkedList<Character> l2 = new LinkedList<>();
		        
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr2.length; j++) {  // Fix the loop bound here
		                if (arr[i] == arr2[j]) {
		                    m++;
		                    l1.add(arr[i]);
		                    l2.add(arr2[j]);
		                    arr[j]=0;
		                    break; // Exit after first match to avoid duplicate matching
		                }
		            }
		        }
		        
		        System.out.println("Matching characters: " + l1);
		        System.out.println("Matching characters: " + l2);
		        
		        for (int i = 0; i < l1.size(); i++) {
		            Character on = l1.get(i);
		            Character on2 = l2.get(i);
		            if (!(on.equals(on2))) {
		                n++;
		            }
		        }
		        
		        t = n / 2;  // integer division is fine here for counting mismatches

		        double le1 = (double) s1.length();
		        double le2 = (double) s2.length();
		        
		        double r = (double) (m - t) / m;
		        
		        System.out.println("m: " + m);
		        System.out.println("n: " + n);
		        System.out.println("t: " + t);
		        System.out.println("r: " + r);
		    

	}

}
