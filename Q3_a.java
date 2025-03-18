class Fruit{
	String name;
	double weight,price;
	
	Fruit(String n,double w,double p){
		name=n;
		weight=w;
		price=p;
	}
	double reducePrice(int n) {
		price=price-(n);
		return price;
	}
	double increasePrice(int n) {
		return price=price+n;
	}
	
	void printDetails() {
		System.out.println("Name:"+name);
		System.out.println("Weight:"+weight+"kg");
		System.out.println("Price per kg:"+price);
		System.out.println("total price:"+(weight*price));
	}
}
public class Q3_a {

	public static void main(String[] args) {
		Fruit fruit1=new Fruit("Apple",3.5,110);
		fruit1.reducePrice(10);
		fruit1.printDetails();
 System.out.println();
		Fruit fruit2=new Fruit("Mango",5,90);
		fruit2.increasePrice(20);
		fruit2.printDetails();

	}

}
