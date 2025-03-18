package Inheritance_Java;

import java.util.Scanner;

class np{
 private double t;
	np(double v){
		t=v;
	}
	public double getT() {
		return t;
	}
}
class nd extends np{
	private double x;
	private double t1;
	nd(double b,double c){
		super(b);
		x=c;
	}
	public double resu() {
		double t1=getT();
		double n=((4*t1)/(Math.sqrt(10*t1)));
		return (n/(Math.sqrt(x*t1)+100));
	}
}
public class Single_inheri {

	public static void main(String[] args) {
		double x,y;
		Scanner inp=new Scanner(System.in);
		x=inp.nextDouble();
		y=inp.nextDouble();
		nd obj =new nd(x,y);
		System.out.println(obj.resu());
	}

}
