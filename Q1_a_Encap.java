class Circle{
	private double radius;
	Circle(double r){
		radius=r;
	}
	double area() {
		return 3.14*radius*radius;
	}
}
public class Q1_a_Encap {

	public static void main(String[] args) {
		Circle obj=new Circle(2);
		System.out.println(obj.area());

	}

}
