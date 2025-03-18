class cat{
	String name;
	int age;
	cat(){
		name="Unknown";
		age=0;
	}
	String getName() {
	return	name;
	}
	int getAge() {
		return age;
	}
}
public class Problem1 {

	public static void main(String[] args) {
		cat obj=new cat();
		System.out.println("name:"+obj.getName());
		System.out.println("age:"+obj.getAge());
	}

}
