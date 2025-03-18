package Prev18;

public class Fuck {

	public static void main(String[] args) {
		try {
			int[] num=new int[10];
			System.out.println(num[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
