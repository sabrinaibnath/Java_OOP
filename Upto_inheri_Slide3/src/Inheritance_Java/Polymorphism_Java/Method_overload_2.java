package Polymorphism_Java;
class Eq{
	double re(double t,double x) {
	double h=6*t*t;
	double j=Math.sqrt(t)+x;
	return (Math.sqrt(h/j));
	}
	double re(int t1,int x) {
		return(Math.sqrt((6*t1*t1)/(Math.sqrt(t1)+x)));
	}
	double re(double t2,int x1) {
		return (Math.sqrt((6*t2*t2)/(Math.sqrt(t2)+x1)));
	}
	double re(int t2,double x1) {
		return (Math.sqrt((6*t2*t2)/(Math.sqrt(t2)+x1)));
	}

	
}
public class Method_overload_2 {

	public static void main(String[] args) {
		Eq obj=new Eq();
		System.out.println(obj.re(100.00,500.00));
		System.out.println(obj.re(100.00, 500));
		System.out.println(obj.re(100, 500.00));
		System.out.println(obj.re(100,500));

	}

}
