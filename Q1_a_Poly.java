import java.util.Scanner;

class Circle2{
	double radius;
	Circle2(double r){
		radius=r;
	}
	Circle2(){
		radius=-1;
	}
	
	double area() {
		return 3.14*radius*radius;
	}
	
}
public class Q1_a_Poly {

	public static void main(String[] args) {
		double r;
		Scanner in=new Scanner(System.in);
		r=in.nextDouble();
		Circle2 obj=new Circle2(r);
		System.out.println(obj.area());
		Circle2 obj2=new Circle2();
		System.out.println(obj2.area());
		

	}

}
