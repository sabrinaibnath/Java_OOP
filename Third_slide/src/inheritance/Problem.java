package inheritance;

import java.util.Scanner;

class hi{
	int c,m;
	double b;
	hi(int t){
		c=t;
		m=4*c;
		b=m/(Math.sqrt(10*c));
	}
}
class bye extends hi{
	int a;
	double n;
	bye(int ti,int x){
		super(ti);
		a=x;
		n=(Math.sqrt(x*super.c)+100);
	}
	void show() {
		System.out.println(super.b/n);
	}
}
public class Problem {

	public static void main(String[] args) {
		int t,x;
		Scanner in= new Scanner(System.in);
		t=in.nextInt();
		x=in.nextInt();
		bye sad= new bye(t,x);
		sad.show();
	}

}
