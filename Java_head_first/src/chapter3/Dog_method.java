package chapter3;

import java.util.Scanner;

class dog{
	int size;
	String name;
	
	void bark() {
		if(size > 60) {
			System.out.println("woof!Woof");
		}
		else if(size > 14) {
			System.out.println("Ruff! Ruff");
		}
		else {
			System.out.println("yip ! yip");
		}
	}
}
public class Dog_method {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		dog obj1 = new dog();
		//obj1.name=in.nextLine();
		obj1.size=in.nextInt();
		
		dog obj2 = new dog();
		//obj2.name=in.nextLine();
		obj2.size=in.nextInt();
		
		//System.out.print(obj1.name);
		//System.out.println(obj1.size);
		//System.out.print(obj2.name);
		//System.out.println(obj2.size);
		obj1.bark();
		obj2.bark();
		
	}

}
