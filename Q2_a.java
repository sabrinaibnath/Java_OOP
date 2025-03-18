abstract class ABC{
	double total;
	final double vat=0.18;
	
	//constructor fot total
	ABC(double t){
		total=t;
	}
	
	abstract void estimateSweetPrice();
	abstract void estimateSnakePrice();
	
	void VAT() {
		System.out.println(total*vat);
	}
}
class DEF extends ABC{
	double sweet1,sweet2;
	DEF(double t,double f,double s){
		super(s);
		sweet1=t;
		sweet2=f;
	}
	void estimateSweetPrice() {
	  System.out.println(sweet1*super.vat+ "this is the final for sweet");
	}

	void estimateSnakePrice() {
		System.out.println(sweet2*super.vat+ "this is the final for snake");
		
	}
	
	void VAT() {
		System.out.println("this is total including VAT"+(total*0.17));
	}
	
}
class GHI extends DEF{
	GHI(double j,double l,double i){
		super(j,l,i);
	}
	
	void estimateSweetPrice() {
		  System.out.println(((sweet1*super.vat)+100)+"this is the final for sweet with extra charge");
		}

	void estimateSnakePrice() {
		System.out.println((sweet2*super.vat+200)+"this is the final for snake with extra charge");
		
	}
	void VAT() {
		System.out.println("this is total including VAT with extra charge"+(total*0.9));
	}
}
public class Q2_a {

	public static void main(String[] args) {
		double s=30.00+40.00;
		GHI obj=new GHI(30.00,40.00,s);
		obj.estimateSnakePrice();
		obj.estimateSweetPrice();
		obj.VAT();
		
		DEF obj2=new DEF(30.00,40.00,s);
		obj2.estimateSnakePrice();
		obj2.estimateSweetPrice();
		obj2.VAT();

	}

}
