package Prev18;
class Employ{
	private String name,addr;
	private int age, salary,phn;
	Employ(String n,int a,int p,String add ){
		name=n;
		age=a;
		phn=p;
		addr=add;
	}
	int computeSalary(int s){
		salary=s;
		return salary;
	}
	
	String getName() {
		return name;
	}
	String getAddress() {
		return  addr;
	}
	int getAge() {
		return age;
	}
	int getPhnone() {
		return phn;
	}
	
	
}
class Teacher extends Employ{
	int rei;
	Teacher(String n,int a,int p,String add,int rei ){
		super(n,a,p,add);
		this.rei=rei;
	}
	void viewTeacherInfo() {
		System.out.println("reacharse intrest"+rei);
		System.out.println("Name:"+super.getName());
		System.out.println("Address:"+super.getAddress());
		System.out.println("Phone:"+super.getPhnone());
	}
	int computeSalary(int s){
		int r=super.computeSalary(s);
		return (r+100000);
	}
	
}
class Officer extends Employ{
	int dei;
	Officer(String n,int a,int p,String add,int d ){
		super(n,a,p,add);
		dei=d;
	}
	void viewTeacherInfo() {
		System.out.println("reacharse intrest"+dei);
		System.out.println("Name:"+super.getName());
		System.out.println("Age:"+super.getAge());
		System.out.println("Address:"+super.getAddress());
		System.out.println("Phone:"+super.getPhnone());
	}
	int computeSalary(int s){
		int r=super.computeSalary(s);
		return (r+500000);
	}

}
public class Q2_b {

	public static void main(String[] args) {
		Teacher obj=new Teacher("Nowshed",20,180,"chawk",20 );
		obj.viewTeacherInfo();
		System.out.println("the salary is:"+obj.computeSalary(500000));
	}

}
