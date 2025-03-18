package Encapsulation_Java;

import java.util.Scanner;

class Noki{
	int a,b;
	Noki(int n1,int n2){
		a=n1;
		b=n2;
	}
	int col() {
		return a+b;
	}
}
class Pookie extends Noki{
	int c;
	Pookie(int n1,int n2,int n3){
		super(n1,n2);
		c=n3;
	}
	int col() {
		int j=super.col();
		return j+c;
	}
}
public class Fuck {

	public static void main(String[] args) {
		int num1,num2,num3;;
		Scanner inp=new Scanner(System.in);
		num1=inp.nextInt();
		num2=inp.nextInt();
		num3=inp.nextInt();
		Pookie obj=new Pookie(num1,num2,num3);
		System.out.println(obj.col());

	}

}
