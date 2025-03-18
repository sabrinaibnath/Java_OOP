package Prev18;
class Add{
	static int a,b;
	Add(int num1,int num2){
		a=num1;
		b=num2;
	}
	static int add() {
		return a+b;
	}
}
public class Q2_c {

	public static void main(String[] args) {
	 Add.a=2;
	 Add.b=3;
	 System.out.println(Add.add());
	 
	  

	}

}
