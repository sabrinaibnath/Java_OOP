class Circle3{
	double radius;
	Circle3(double r){
		radius=r;
	}
	double area() {
		return 3.14*radius*radius;
	}
}
class Oval extends Circle3{
	Oval(double k){
		super(k);
	}
	void show() {
		System.out.println(super.area());
	}
}
public class Q1_a_Inher {

	public static void main(String[] args) {
		Oval obj=new Oval(2);
		obj.show();
		

	}

}
