package Inheritance_Java;

import java.util.Scanner;

class Choi{
	private double t;
	
	public void setT(double r) {
		t=r;
	}
	
	public double getT() {
		return t;
	}
}
class Teak extends Choi{
	
	public double ValueT() {
		 double n=getT();
		 double d=Math.sqrt(10*n);
		return((4*n)/(d));
	}
}
class Ko extends Teak{
	private double x;
	public void setX(double c) {
		x=c;
	}
	public double valueX() {
		double j=getT();
		double z=Math.sqrt(x*j);
		return (z+100);
	}
	public double ValueN() {
		return super.ValueT();
	}
}
public class Multilevel_inheri_java {

	public static void main(String[] args) {
		double t,x;
		Scanner inp=new Scanner(System.in);
		t=inp.nextDouble();
		x=inp.nextDouble();
		Ko obj1=new Ko();
		obj1.setT(t);
		obj1.setX(x);
		double r1=obj1.valueX();
		double r3=obj1.ValueN();
		System.out.println(obj1.ValueN());
		System.out.println(obj1.valueX());
		System.out.println(r3/r1);
	}

	}

