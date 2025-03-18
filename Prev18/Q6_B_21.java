package Prev18;
class A extends Thread{
	A(String n){
	super(n);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName());
		}
	}
}
class B extends Thread{
	B(String n){
	super(n);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName());
		}
	}
}
class C extends Thread{
	C(String n){
	super(n);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName());
		}
	}
}
public class Q6_B_21 {

	public static void main(String[] args) {
		A obj1=new A("Sabrina");
		B obj2=new B("Nowshed");
		C obj3=new C("Chy");
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
