class Thr1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("Thread1 is done");
	}
}
class Thr2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("Thread2 is done");
	}
}
class Thr3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("Thread3 is done");
	}
}
public class Set_Prioroty {

	public static void main(String[] args) {
		Thr1 obj1=new Thr1();
		obj1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Start Thread 1"); 
		obj1.start();
		Thr2 obj2=new Thr2();
		obj2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Start Thread 2"); 
		obj2.start();
		Thr3 obj3=new Thr3();
		obj3.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Start Thread 3"); 
		obj3.start();
		
	}

}
