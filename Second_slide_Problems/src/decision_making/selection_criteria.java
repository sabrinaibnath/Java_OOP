package decision_making;

import java.util.Scanner;

class selection{
	int age,bat,cat,bo;
	double hi;
	selection(int a,int b,int c,double h,int b2){
		age=a;
		bat=b;
		cat=c;
		hi=h;
		bo=b2;
	}
	void show() {
		if((age>=25 && age<=40)&&(bat>=40)&&(cat>=70)|(bat>=50)) {
			System.out.println("Batsman");
		}
		else if((age>=20 && age<=35)&&(hi>=5.75)&&(bo>=30)|(bo<=25)) {
			System.out.println("Bowler");
		}
		else if((age>=25 && age<=35)&&(bat>=20)&&(cat<=80)) {
			System.out.println("wicketkeeper");
		}
		
	}
}
public class selection_criteria {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		double e=in.nextDouble();
		
		selection obj=new selection(a,b,c,e,d);
		obj.show();
		

	}

}
