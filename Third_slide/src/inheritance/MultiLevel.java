package inheritance;

import java.util.Scanner;

class a1{
	 int a;
	a1(int e){
		a=e;
	}
}
class b1 extends a{
	int b;
	b1(int w,int q){
		super(w);
		b=q;
	}
}
class c1 extends b{
	int r;
	c1(int x,int y,int z){
		super(x,y);
		r=z;
	}
	void show() {
		System.out.println(super.p*super.x*r);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		int a,b,d;
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		d=in.nextInt();
		c1 obj=new c1(a,b,d);
		obj.show();
	}

}
