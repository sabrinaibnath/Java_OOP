package Inheritance_Java;

import java.util.Scanner;

class Bok{
	private double t;
	
	public void setT(double k) {
		t=k;
	}
	public double getT() {
		return t;
	}
}
interface hok{
	double valueT();
}
interface nok{
	double valueX();
}
class Mn extends Bok implements hok{
	public double valueT() {
		double d=getT();
		double h=4*d;
		double k=Math.sqrt(10*d);
		return (h/k);
	}
}
class Df extends Bok implements nok{
	private double x;
	public void setX(double r) {
		x=r;
	}
	public double valueX() {
		double g=getT();
		double s=Math.sqrt(x*g);
		return (s+100);
	}
}

public class Multiple_inher {

	public static void main(String[] args) {
		double t,x;
		Scanner inp=new Scanner(System.in);
		t=inp.nextDouble();
		x=inp.nextDouble();
		Mn obj1=new Mn();
		obj1.setT(t);
		double r1=obj1.valueT();
		
		Df obj2=new Df();
		obj2.setX(x);
		double r2=obj2.valueX();
		System.out.println(r1/r2);
		
	}

}
