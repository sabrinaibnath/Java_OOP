package polymorphism_problems;

import java.util.Scanner;

class Equation{
	double one(int x) {
		return (6*x*x);
	}
	double one(int t,int n) {
		return((Math.sqrt(t))+n);
	}
}
public class Probelm_three {

	public static void main(String[] args) {
		int t,x;
		double g1,g2,m;
		Scanner in= new Scanner(System.in);
		t=in.nextInt();
		x=in.nextInt();
		Equation obj=new Equation();
		g1=obj.one(t);
		g2=obj.one(t, x);
		m=Math.sqrt(g1/g2);
		System.out.println(m);
		
	}

}
