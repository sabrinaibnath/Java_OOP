import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Binary_Search_In_Java {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		Integer f;
		Scanner in=new Scanner(System.in);
		f=in.nextInt();
		System.out.println("It's is index :"+Collections.binarySearch(v, f));
		in.close();
	}

}
