package inheritance;

import java.util.Scanner;

class mine{
	int a;
	mine(int m){
		a=m;
	}
}
interface yours{
	int b=10;
	
}
class ours extends mine implements yours{
	ours(int x){
		super(x);
		System.out.println(super.a+b);
	}
}
public class Multiple {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
	ours baby=new ours(a);
	}

}
