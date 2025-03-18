package Inheritance_Java;
class Shape{
	  public double getArea() {
		  return 0.0;
	  }
}
class Rac extends Shape{
	private int l,w;
	public void setL(int a,int b) {
		l=a;
		w=b;
	}
	public double getArea() {
		return l*w;
	}
}
public class Shape_inheri {

	public static void main(String[] args) {
	Rac obj=new Rac();
	obj.setL(3, 4);
	System.out.println(obj.getArea());

	}

}
