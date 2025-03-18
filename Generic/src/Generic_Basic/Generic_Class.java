package Generic_Basic;
class MyG<Thing>{
	Thing x;
	MyG(Thing k){
		x=k;
	}
	Thing getValue() {
		return x;
	}
}
public class Generic_Class {

	public static void main(String[] args) {
		MyG obj=new MyG(1);
		System.out.println(obj.getValue());
		MyG obj2=new MyG(2.00);
		System.out.println(obj2.getValue());
	}

}
