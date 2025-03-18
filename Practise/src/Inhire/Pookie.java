package Inhire;
class nok{
	void show1() {
		System.out.println("fuck u");
	}
}
class boki extends nok{
	void show2() {
		System.out.println("fun");
	}
}
public class Pookie {
 public static void main(String args[]) {
	 boki obj=new boki();
	 obj.show1();
	 obj.show2();
	 nok obj2=new nok();
	 obj2.show1();
 }
}
