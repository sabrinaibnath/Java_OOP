package Prev18;

import java.util.Scanner;

class Area{
	int hight,base;
	Area(int hight,int base){
		this.hight=hight;
		this.base=base;
	}
	void area() {
		double f= (0.5*hight*base);
		System.out.println(f);
	}
}
public class Q1_a {

	public static void main(String[] args) {
		int h,b;
		Scanner in=new Scanner(System.in);
		h=in.nextInt();
		b=in.nextInt();
		Area obj=new Area(h,b);
		obj.area();
	}

}
