package decision_making;
import java.util.*;
class square{
	int num; //Instance variable
	square(int n){ //constructor the store the num 
		num=n;
	}
	void dis() { //show the square
		if(num<=10) {
			System.out.println(num*num);
		}
		else {
			System.out.println("it is greater then 10");
		}
	}
}

public class Square_less10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		square s=new square(x);
		s.dis();
	}

}
