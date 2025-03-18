package Generic_Basic;
class GenericClass2 <Thing extends Number,Thing2 extends Number>{//so we cannot pass string and character
	Thing data;
	Thing2 da;
	GenericClass2(Thing x,Thing2 y){
		data=x;
		da=y;
	}
	public Thing getValue1() {
		return data;
	}
	public Thing2 getValue2() {
		return da;
	}
}
public class Y_Generic3 {

	public static void main(String[] args) {
			GenericClass2<Integer,Integer> obj=new GenericClass2<>(1,3);
			GenericClass2<Double,Double> obj2=new GenericClass2<Double,Double>(1.1,5.1);
			//GenericClass2<Character,Character> obj3=new GenericClass2<Character,Character>('a','b');
			//GenericClass2<String,String> obj4=new GenericClass2<>("S","f");
			System.out.println(obj.getValue1());
			System.out.println(obj2.getValue1());
			//System.out.println(obj3.getValue1());
			//System.out.println(obj4.getValue1());
			System.out.println(obj.getValue2());
			System.out.println(obj2.getValue2());
		/*
		 * System.out.println(obj3.getValue2()); System.out.println(obj4.getValue2());
		 */			
	}
}
