package decision_making;

import java.util.Scanner;

class admission{
	int math,phy,chem,sum,sump;
	admission(int m,int p,int c,int s,int s2){
	math=m;
	phy=p;
	chem=c;
	sum=s;
	sump=s2;
	}
	void show() {
		if((math>=60 & phy>=50 & chem>=40 & sum>=200)|(sump>=150)) {
			System.out.println("eligible");
		}
		else {
			System.out.println(" not eligible");
		}
	}
}
public class course_addmission {

	public static void main(String[] args) {
	int a,b,c,sum1,sum2;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	sum1=a+b+c;
	sum2=a+b;
	admission obj=new admission(a,b,c,sum1,sum2);
	obj.show();
	}

}
