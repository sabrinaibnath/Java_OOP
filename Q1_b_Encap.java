class Pinko{
	private String name;
	Pinko(String s){
		name=s;
	}
	String getName() {
		return name;
	}
}
public class Q1_b_Encap {

	public static void main(String[] args) {
		Pinko obj=new Pinko("Sabrina");
		System.out.println(obj.getName());

	}

}
