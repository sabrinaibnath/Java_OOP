package Abstract;

import java.util.Scanner;

abstract class Pookie{
	abstract void Sum();
}
class Pinky extends Pookie{
	int a,b;
	Pinky(int g,int f){
		a=g;
		b=f;
	}
	void Sum() {
		System.out.println(a+b);
	}
}
public class Abs_Class {

	public static void main(String[] args) {
		int a,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		Pinky obj=new Pinky(a,b);
		obj.Sum();

	}

}
