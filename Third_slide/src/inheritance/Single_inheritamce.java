package inheritance;

import java.util.Scanner;

class sup{
	int x;
	sup(int a){
		x=a;
	}
}
class sub extends sup{
	int d;
	sub(int a,int b) {
		super(a);
		d=b; 
	}
	void show() {
		System.out.println(super.x+d);
	}
	
}
public class Single_inheritamce {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		sub o=new sub(x,y);
		o.show();
	}

}
