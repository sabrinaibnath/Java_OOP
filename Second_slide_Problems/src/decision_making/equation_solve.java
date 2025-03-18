package decision_making;

import java.util.Scanner;

class equation{
	int a1,b1,c1,d1;
	double x1,x2;
	equation(int a,int b,int c,int d,double p, double q){
		a1=a;
		b1=b;
		c1=c;
		d1=d;
		x1=p;
		x2=q;
	}
	void show() {
		if((a1==0)&&(b1==0)) {
			System.out.println("no solution");
		}
		else if(a1==0) {
			System.out.println(-(c1/(double)b1));
		}
		else if(d1<0) {
			System.out.println("no real root");
		}
		else{
			System.out.println(x1);
			System.out.println(x2);
		}
	}
}
public class equation_solve {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=((b*b)-(4*a*c));
		double x1,x2,n;
		n=(Math.sqrt(d))/(2*a);
		x1=-b+n;
		x2=-b-n;
		equation ibj= new equation(a,b,c,d,x1,x2);
		ibj.show();
	}

}
