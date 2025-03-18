package Chapter8_3;
class mn{
	public  <Thing>void gerM(Thing[] s) {
		for(Thing x:s) {
		System.out.println(x);
		}
	}
}
public class Generic_Method {

	public static void main(String[] args) {
		Integer[] k= {1,2,3,3};
		mn on=new mn();
		on.gerM(k);
	}

}
