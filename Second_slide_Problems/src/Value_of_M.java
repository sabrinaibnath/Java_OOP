import java.util.*;

public class Value_of_M {

	public static void main(String[] args) {
		int x,t;
		Scanner in=new Scanner(System.in);
		System.out.println("please enter the value of x and t");
		x=in.nextInt();
		t=in.nextInt();
		int T=6*t*t;
		double c=Math.sqrt(t)+x;
		double m=Math.sqrt(T/c);
		System.out.println(m);
	}

}
