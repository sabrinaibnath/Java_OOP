package Inheritance_Java;
class Employee{
	public void work() {
		System.out.println("this is work");
	}
	int gerSalary() {
		return 500000;
	}
}
class HRManager extends Employee{
	public void work() {
		System.out.println("this is Hrmanager");
	}
	void addEmployee() {
		System.out.println("new employee is added ");
	}
}
public class inheri_pro4 {

	public static void main(String[] args) {
	Employee obj=new Employee();
	obj.work();
	HRManager obj2=new HRManager();
	obj2.work();
	obj2.addEmployee();

	}

}
