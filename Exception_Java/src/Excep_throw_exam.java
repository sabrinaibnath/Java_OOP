import java.util.Scanner;

class NoMatchException extends Exception{
	NoMatchException(String m){
		super(m);
	}
}
public class Excep_throw_exam {

	public static void main(String[] args)  {
		String s1,s2;
		Scanner inp=new Scanner(System.in);
		s1=inp.nextLine();
		s2="Bangladesh";
		try {
		if(s1.equals(s2)) {
			System.out.println("Match");
		}
		else {
			throw new NoMatchException("NOT MATCH");
		}
	}
	catch(NoMatchException e){
		System.out.println(e.getMessage());
	}
		finally {
			System.out.println("finally block");
		}
	}

}
