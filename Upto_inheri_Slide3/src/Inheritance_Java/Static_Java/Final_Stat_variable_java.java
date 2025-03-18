package Static_Java;
class Constant{
	static final double pi=3.1416;
	double area(int r) {
		return pi*r*r;
	}
}
public class Final_Stat_variable_java {

	public static void main(String[] args) {
		Constant obj=new Constant();
		System.out.println(obj.area(4));
	}

}
