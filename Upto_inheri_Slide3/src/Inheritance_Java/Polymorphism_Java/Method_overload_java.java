package Polymorphism_Java;
class Display{
	void disp(Character c) {
		System.out.println(c);
	}
	void disp(Character d,int w) {
		System.out.println(d+","+w);
	}
	void disp(Character f,int e,double r) {
		System.out.println(f+","+e+","+r);
	}
}
public class Method_overload_java {

	public static void main(String[] args) {
		Display obj=new Display();
		obj.disp('a');
		obj.disp('a', 10);
		obj.disp('a', 10, 5.5);
		
	}

}
