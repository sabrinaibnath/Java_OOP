package decision_making;

import java.util.Scanner;

class grade{
	int marks;
	grade(int m){
		marks=m;
	}
	void show() {
		if(marks>=80) {
			System.out.println("Distiction");
		}
		else if(marks>=70 & marks<=79) {
			System.out.println("vary good");
		}
		else if(marks>=60 & marks<=69) {
			System.out.println("pass");
		}
		else if(marks<=60) {
			System.out.println("Fail");
		}

	}
}
public class grade_student {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		grade obj=new grade(x);
		obj.show();
		
	}

}
