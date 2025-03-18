package inheritance;

import java.util.Scanner;

class a{
	int x;
	a(int v){
		x=v;
	}
}
class b extends a{
	int p;
	b(int w,int e){
		super(w);
		p=e;
	}
	void show() {
		System.out.println(super.x+p);
	}
}
class c extends a{ 
	int f;
	c(int k,int j){
		super(k);
		f=j;
	}
	void dis() {
		System.out.println(super.x*f);
	}
}
class d extends a{
	int i;
	d(int u,int o){
		super(u);
		i=o;
	}
	void fuc(){
		System.out.println(super.x/i);
	}
}
public class Hierarchical_basic {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		b obj1=new b(a,b);
		obj1.show();
		c obj2=new c(a,c);
		obj2.dis();
		d obj3=new d(a,d);
		obj3.fuc();
	}

}
