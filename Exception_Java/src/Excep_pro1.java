import java.util.Scanner;

public class Excep_pro1 {

	public static void main(String[] args) {
		int[] data=new int[5];
		Scanner inp=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int j=inp.nextInt();
			data[i]=j;
		}
		try {
			int x=data[0]/0;
			System.out.println("this is checking");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			int y=data[1]/data[0];
			System.out.println("y="+y);
		}

	}

}
