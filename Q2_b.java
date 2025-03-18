class Display{
	void disp(char x) {
		System.out.println(x);
	}
	void disp(char y,int a) {
		System.out.println(y+","+a);
	}
	void disp(char f, int g, double j) {
		System.out.println(f+","+g+","+j);
	}
}
public class Q2_b {

	public static void main(String[] args) {
		Display obj=new Display();
		obj.disp('a');
		obj.disp('a', 10);
		obj.disp('a', 10, 5.5);
	}

}
