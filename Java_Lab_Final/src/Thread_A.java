class A extends Thread{
	public void run() {
		System.out.println("Hi");
	}
}
class B extends Thread{
	public void run() {
		System.out.println("Hi");
	}
}
class C extends Thread{
	public void run() {
		System.out.println("Hi");
	}
}
class D implements Runnable{
	public void run() {
		System.out.println("From d");
	}
}
public class Thread_A {

	public static void main(String[] args) {
		A obj1=new A();
		obj1.start();
		
		B obj2=new B();
		obj2.start();
		
		C obj3=new C();
		obj3.start();
		
		D obj=new D();
		Thread n=new Thread(obj);
		n.start();
		
		
	}

}
