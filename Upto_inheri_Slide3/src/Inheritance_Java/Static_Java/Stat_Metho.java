package Static_Java;

import java.util.Scanner;

class MathUtility{
	
	public static int sum(int x,int y) {
		return x+y;
	}
}
public class Stat_Metho {

	public static void main(String[] args) {
		int n1,n2;
		Scanner inp=new Scanner(System.in);
		n1=inp.nextInt();
		n2=inp.nextInt();
		System.out.println(MathUtility.sum(n1, n2));
	}

}
