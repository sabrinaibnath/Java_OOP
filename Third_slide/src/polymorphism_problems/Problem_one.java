package polymorphism_problems;
class TestDemo{
	void test() {
		System.out.println("no parameters");
	}
	void test(int a) {
		System.out.println("one parameter:"+a);
	}
	void test(int a,int b) {
		System.out.println("two parameter:"+a+" " +b);
	}
}
public class Problem_one {

	public static void main(String[] args) {
	TestDemo obj=new TestDemo();
	obj.test();
	obj.test(4);
	obj.test(4, 5);

	}

}
