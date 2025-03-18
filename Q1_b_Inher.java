class A{
	int a;
	A(int number){
		a=number;
	}
}
class B extends A{
	int b,a;
	B(int num1,int num2){
		super(num1);
		b=num2;
	}
	void Show() {
		System.out.println(b+super.a);
	}
}
public class Q1_b_Inher {

	public static void main(String[] args) {
		B obj=new B(1,7);
         obj.Show();
	}

}
