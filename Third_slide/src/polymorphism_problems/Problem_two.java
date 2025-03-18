package polymorphism_problems;
class Display{
	void show(char a) {
		System.out.println(a);
	}
	void show(char c, int b) {
		System.out.println("two are:"+c +" " +b);
	}
	void show(char d, int f, double m) {
		System.out.println("there are:"+d+" "+f+" "+m);
	}
}
public class Problem_two {

	public static void main(String[] args) {
		Display obj=new Display();
		obj.show('a');
		obj.show('a', 10);
		obj.show('a', 10, 5.5);

	}

}
