package Abstract;

import java.util.Scanner;

abstract class Nooni{
	abstract void show();
	int add(int h, int r) {
		return h+r;
	}
}
class fuck extends Nooni{
	
	int add(int h,int r) {
		return h+r;
	}
	void show() {
		System.out.println("ho");
	}
}
public class Abs_Class_With_Con {

	public static void main(String[] args) {
		int num1,num2;
		Scanner in=new Scanner(System.in);
		num1=in.nextInt();
		num2=in.nextInt();
		fuck obj=new fuck();
		System.out.println(obj.add(num1, num2));
		obj.show();
	}

}
