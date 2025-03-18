class Orig{
	int a;
	public void show() {
		System.out.println("this is in Orig");
	}
	class Brown{
		public void config() {
			System.out.println("this is in brown");
		}
	}
	static class Black{
		public void coni() {
			System.out.println("this is in Balck");
		}
	}
	
}
public class Inner_Class_Demo {

	public static void main(String[] args) {
		Orig obj=new Orig();//that's the proper way to create an object of a class
		Orig.Brown obj1=obj.new Brown();//that's the proper way to create an object of a  non static inner class
		Orig.Black obj2=new Orig.Black();//that's the way to create an object of a static inner class 
		obj1.config();// i can not make outer class static ,only inner class can be static
		obj2.coni();
		obj.show();
	}

}
