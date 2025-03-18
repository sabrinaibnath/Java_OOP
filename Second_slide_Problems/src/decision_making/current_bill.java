package decision_making;

import java.util.Scanner;

class bill{
	double unit;
	double tk;
	bill(double u){
		unit=u;
	}
	void show() {
		if(unit>=100 && unit<200) {
			tk=0.8*unit+100;
			System.out.println(tk);
		}
		else if(unit>200 && unit<=299) {
			tk=(0.8*unit)+(unit*0.9)+100;
			System.out.println(tk);
			
		}
		else if(unit>=300) {
			tk=(unit*0.8)+100+(unit*0.8)+unit;
			System.out.println(tk);
		}
		if(tk>=400) {
			tk=tk+tk*0.15;
			System.out.println(tk);
		}
		
	}
}
public class current_bill {

	public static void main(String[] args) {
	double u;
	Scanner in=new Scanner(System.in);
	u=in.nextDouble();
	bill b=new bill(u);
	b.show();
	}

}
