package Chapter8_2;
class MyClass<Thing>{
	private Thing data1;
	private Thing data2;
	MyClass(Thing x,Thing y){
		data1=x;
		data2=y;
	}
	void setData1(Thing nx) {
		data1=nx;
	}
	void setData2(Thing ny) {
		data2=ny;
	}
	Thing getData1() {
		return data1;
	}
	Thing getData2() {
		return data2;
	}
}
public class MyGenericclass1 {

	public static void main(String[] args) {
		MyClass<Integer> obj=new MyClass<>(1,3);
		System.out.println(obj.getData1());
		System.out.println(obj.getData2());
	}

}
