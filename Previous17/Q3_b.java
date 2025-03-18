package Previous17;
class Doja{
	int n;
	Doja(int y){
		n=y;
	}
	void modifyObj(Doja o) {
		o.n+=10;
		System.out.println(o.n);
	}
	void modifyPri(int t) {
		t=t+10;
		System.out.println(t);
	}
}
public class Q3_b {

	public static void main(String[] args) {
		Doja cat=new Doja(2);
		cat.modifyObj(cat);
		cat.modifyPri(3);
		System.out.println(cat.n);

	}

}
