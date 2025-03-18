package Static_Java;

import java.util.Scanner;

class Counter{
	private static int count=0;
	Counter(){
		count++;
	}
	public static int getC() {
		return count;
	}
}
public class Vari_Stat {

	public static void main(String[] args) {
		int n;
		Scanner inp=new Scanner(System.in);
		n=inp.nextInt();
		for(int i=1;i<=n;i++) {
			Counter objn=new Counter();

		}
				
		System.out.println(Counter.getC());
	}

}
