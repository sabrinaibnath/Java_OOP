import java.util.Scanner;
class ValueExceedException extends Exception{
	ValueExceedException(String m){
		super(m);
	}
}
public class Excep_example2 {
	public static void main(String[] args) {
		int number;
		Scanner inp=new Scanner(System.in);
		number=inp.nextInt();
		try {
		if(number>100) {
			throw new ValueExceedException("value is exceeded");
		}
		}
		catch(ValueExceedException e) {
			System.out.println(e.getMessage());
		}
	}
}
