import java.util.Scanner;
class LowBatteryException extends Exception{
	LowBatteryException(int n){
		super("Battery is low! Should be above 20\n current value:"+n);
	}
}
public class Q5_C {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.println("Enter current charge percent:");
			int chargeAmount=sc.nextInt();
			try {
				if(chargeAmount<=20) {
					throw new LowBatteryException(chargeAmount);
				}
				else {
					System.out.println("enough charge in battery");
				}
			}
			catch(LowBatteryException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
