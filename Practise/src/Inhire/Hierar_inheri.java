package Inhire;
class Value{
	private int t;
	void setT(int m) {
		t=m;
	}
	int getT() {
		return t;
	}
}
class Upper1 extends Value{
	double ValueT() {
		int t=super.getT();
		return ((4*t)/(Math.sqrt(10*t)));
	}
}
class Lower2 extends Value{
	private int x;
	void setX(int n) {
		x=n;
	}
	double ValueX() {
		int t=super.getT();
		return ((Math.sqrt(x*t)+100));
	}
}
public class Hierar_inheri {

	public static void main(String[] args) {
		Upper1 obj=new Upper1();
		obj.setT(100);
		double j=obj.ValueT();
		
		Lower2 obj2=new Lower2();
		obj2.setX(20);
		obj2.setT(100);
		double k=obj2.ValueX();
		
		System.out.println(j/k);
	}

}
