import java.util.Scanner;

class NoMatchException1 extends Exception{
	NoMatchException1(String message){
		super(message);
	}
}
class Equal{
	String s1,s2;
	void setE(String d,String e) {
		s1=d;
		s2=e;
	}
	void show() throws NoMatchException1{
		if(s1==null | s2==null) {
			throw new NoMatchException1("one of them is null");
		}
		else {
		if(s1.equals(s2)) {
			System.out.println("It is a match");
		}
		else {
			throw new NoMatchException1("No Match");
		}
	}
	}
}
public class Throws_example {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String s1,s2;
		s1=inp.nextLine();
		s2=inp.nextLine();
		try {
			Equal obj=new Equal();
			obj.setE(s1, s2);
			obj.show();
		}
		catch(NoMatchException1 e) {
			System.out.println(e.getMessage());
		}

	}

}
