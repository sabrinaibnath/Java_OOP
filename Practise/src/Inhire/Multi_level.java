package Inhire;

import java.util.Scanner;

class Ti{
	 private int t;
	 void setT(int n) {
		t=n;
	}
	int getT() {
		return t;
	}
	double upper1() {
		return ((4*t));
	}
}
class TiL extends Ti{
	
	double upper2() {
		return (super.upper1()/(Math.sqrt(10*super.getT()))); 
	}
}
class Low extends TiL{
	private int x;
	void setX(int b) {
		x=b;
	}
	
	double full() {
	return (super.upper2()/(Math.sqrt(x*super.getT())+100));	
	}
}
public class Multi_level {
   public static void main(String args[]) {
	   int x,t;
	   Scanner in=new Scanner(System.in);
	   x=in.nextInt();
	   t=in.nextInt();
	   Low obj=new Low();
	   obj.setT(t);
	   obj.setX(x);
	   System.out.println(obj.full());
   }
}
//use super.value to access the upper value don't put on another value'