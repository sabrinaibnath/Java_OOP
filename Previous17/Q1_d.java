package Previous17;
class Employ{
	String name;
	private int salary;
	Employ(){
		name="sa";
		salary=20;
	}
	void dis() {
		System.out.println(name+salary);
	}
}
public class Q1_d {

	public static void main(String[] args) {
	Employ em1=new Employ();
	Employ em2=em1;
	try {
		em2.name="Ronu";
		//em2.salary=3;//this line will throw an compilation error
		em1.dis();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	

	}

}
