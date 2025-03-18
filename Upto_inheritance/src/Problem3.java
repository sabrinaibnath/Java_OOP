import java.util.Scanner;

class book{
	String title,author;
	double price;
	book(){
		title="oop";
		author="sabrina";
		price=500.00;
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	book(String t,String a){
		title=t;
		author=a;
		System.out.println(title);
		System.out.println(author);
		
	}
	book(String s1,String a1,double p1){
		title=s1;
		author=a1;
		price=p1;
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	
}
public class Problem3 {

	public static void main(String[] args) {
		book b1=new book();
		String t,a;
		double p;
		Scanner in=new Scanner(System.in);
		p=in.nextDouble();
		in.nextLine();
		t=in.nextLine();
		a=in.nextLine();
		book b2=new book(t,a);
		book b3=new book(t,a,p);

	}

}
