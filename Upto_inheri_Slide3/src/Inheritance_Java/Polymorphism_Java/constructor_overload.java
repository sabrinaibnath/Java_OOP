package Polymorphism_Java;
class Box{
	double wid,hei,de;
	Box(){
		wid=-1;
		hei=-1;
		de=-1;
	}
	Box(double w){
		wid=hei=de=w;
	}
	Box(double w1,double h1,double d1){
		wid=w1;
		hei=h1;
		de=d1;
	}
	double volume() {
		return wid*hei*de;
	}
}
public class constructor_overload {

	public static void main(String[] args) {
		Box obj=new Box();
		System.out.println(obj.volume());
		Box obj1=new Box(1.0,2.0,3.0);
		System.out.println(obj1.volume());
	}

}
