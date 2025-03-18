package Inheritance_Java;

import java.util.Scanner;

class Ext{
	private double t;
	
	public void setT(double u) {
		t=u;
	}
	public double getT() {
		return t;
	}
}
class Res extends Ext{
	public double valueOfT() {
		double t1=super.getT();
		double r4=10*t1;
		return ((4*t1)/(Math.sqrt(r4)));
	}
}
class hoki extends Ext{
	private double x;
	
	public void setX(double j) {
		x=j;
	}
	public double res() {
		double n=getT();
		double k=Math.sqrt(x*n);
		return(k+100);
	}
}
public class Hierar_inher {

	public static void main(String[] args) {
		double t,x;
		Scanner inp=new Scanner(System.in);
		t=inp.nextDouble();
		x=inp.nextDouble();
		
		Res obj1=new Res();
		obj1.setT(t);
		double re1=obj1.valueOfT();
		
		hoki obj2=new hoki();
		obj2.setT(t);
		obj2.setX(x);
		double r2=obj2.res();
		
		System.out.println(re1);
		System.out.println(r2);
		System.out.println(re1/r2);
	}

}
