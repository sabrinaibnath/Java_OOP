package Generic_Basic;
class MyGenericClass <Thing,Thing2>{
	Thing data;
	Thing2 da;
	MyGenericClass(Thing x,Thing2 y){
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
public class Y_Generic2 {

	public static void main(String[] args) {
	MyGenericClass<Integer,String> obj=new MyGenericClass<>(1,"S");
	MyGenericClass<Double,Character> obj2=new MyGenericClass<Double,Character>(1.1,'a');
	MyGenericClass<Character,Character> obj3=new MyGenericClass<Character,Character>('a','b');
	MyGenericClass<String,String> obj4=new MyGenericClass<>("S","f");
	System.out.println(obj.getValue1());
	System.out.println(obj2.getValue1());
	System.out.println(obj3.getValue1());
	System.out.println(obj4.getValue1());
	System.out.println(obj.getValue2());
	System.out.println(obj2.getValue2());
	System.out.println(obj3.getValue2());
	System.out.println(obj4.getValue2());
	
	}

}
