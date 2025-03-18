class g{
	public void show() {
		System.out.println("hi");
	}
}
abstract class f{
	public abstract void Dis();
}
public class Anonymous_innar_java {

	public static void main(String[] args) {
		g obj=new g() {
		public void show() {
			System.out.println("no");
		}
		};//this is a inner class and it's name is anonymous inner class
		obj.show();
	
	f obj2=new f() {
      public void Dis() {
			System.out.println("hi");
			
		}
		
	};
	obj2.Dis();

}
}
