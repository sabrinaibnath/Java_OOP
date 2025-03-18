package Inhire;

import java.util.Scanner;

class Tu{
	private int t;
	private int x;
	
	void setT(int n) {
		t=n;
	}
	void setX(int m) {
		x=m;
	}
	int getT() {
		return t;
	}
	int getX() {
		return x;
	}
	
}
interface ValT{
	public double valurT();
}
interface ValX{
	public double valueX();
}
class Upper  extends Tu implements ValT {
	public double valurT() {
		int t1=super.getT();
		return ((4*t1)/(Math.sqrt(10*t1)));
	}	
}
class Lower extends Tu implements ValX{
	public double valueX(){
		int l=super.getT();
		int y=super.getX();
		int k=l*y;
		double b=Math.sqrt(k);
		return (b+100);
	}
}
public class Multiple_Inheri {

	public static void main(String[] args) {
	int x,t;
	Scanner in=new Scanner(System.in);
	System.out.println("enter t");
	t=in.nextInt();
	x=in.nextInt();
	
	Upper obj1=new Upper();
	obj1.setT(t);
	obj1.setX(x);
	double r1=obj1.valurT();
	
	Lower obj2=new Lower();
	obj2.setT(t);
	obj2.setX(x);
	double r2=obj2.valueX();
	System.out.println(r1+"and "+r2);
	System.out.println(r1/r2);
	}

}
