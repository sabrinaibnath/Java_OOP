package polymorphism_problems;

import java.util.Scanner;

class Solve{
	double first(int t) {
		double m=3*t;
		double n=6*t*t;
		double v=m/n;
		return(v*v);
	}
	double first(int x,int r) {
		double c=Math.sqrt(10*r);
		double u=(24*r)/c;
		double q=(Math.sqrt(x*r))+100;
		return(Math.sqrt(u/q));
	}
}
public class Problem_four {

	public static void main(String[] args) {
		int x,t;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		t=in.nextInt();
		double g1,g2,m;
		Solve obj=new Solve();
		g1=obj.first(t);
		g2=obj.first(x, t);
		m=g1/g2;
		System.out.println(m);
	}

}
