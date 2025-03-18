package Static_Java;
class Initializer{
	static int initialValue;
	static {
		initialValue=1000;
	}
}
public class Bolck_stat {

	public static void main(String[] args) {
		System.out.println(Initializer.initialValue);
	}

}
