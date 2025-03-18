package Getting_name;
class S{
	int n;
	String na;
	S(int i,String h){
		n=i;
		na=h;
	}
	public String toString() {
		return n+" "+na;
		}
}
public class To_String_another {

	public static void main(String[] args) {
		S sab=new S(23,"Sabrina");
		System.out.println(sab.toString());
		

	}

}
