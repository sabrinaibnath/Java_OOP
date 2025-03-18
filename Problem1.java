import java.util.*;

class Employees{
	int id;
	String name;
	double salary;
	
	Employees(int i,String n,double s){
		id=i;
		name=n;
		salary=s;
	}
}
public class Problem1 {

	
	public static void main(String[] args) {
		List<Employees>mylist=new LinkedList<Employees>();
		Employees obj1=new Employees(1,"Alice",40000.0);
		Employees obj2=new Employees(2,"Bob",55000.0);
		Employees obj3=new Employees(3,"Carol",70000.0);
		Employees obj4=new Employees(4,"David",20000.0);
		Employees obj5=new Employees(5,"Eve",80000.0);
		Employees obj6=new Employees(6,"Frank",35000.0);
		
		mylist.add(obj1);
		mylist.add(obj2);
		mylist.add(obj3);
		mylist.add(obj4);
		mylist.add(obj5);
		mylist.add(obj6);
		
		LinkedHashMap<Double,Integer>mymap=new LinkedHashMap<>();
		LinkedHashMap<Double,Integer>Fi=new LinkedHashMap<>();
		LinkedHashMap<Integer,String>name=new LinkedHashMap<>();
		LinkedHashMap<Double,Integer>incr=new LinkedHashMap<>();
		LinkedHashMap<Integer,Double>less=new LinkedHashMap<>();
		LinkedHashMap<Integer,Double>eq=new LinkedHashMap<>();
		LinkedHashMap<Integer,Double>more=new LinkedHashMap<>();
		
		for(int i=0;i<mylist.size();i++) {
			Integer Id=mylist.get(i).id;
			Double Salary=mylist.get(i).salary;
			String na=mylist.get(i).name;
			mymap.put(Salary,Id);
			name.put(Id, na);
		}
		
	Comparator<Employees>in=(i,j)->{
		return  (int) (i.salary-j.salary);
	};
		Collections.sort(mylist,in);
		System.out.println(mylist);
		
		for(Map.Entry<Double, Integer>entry:mymap.entrySet()) {
			Double k=entry.getKey();
			if(k>50000.00) {
				Fi.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println("Employee with salary >50000");
		for(Map.Entry<Double, Integer>entry:Fi.entrySet()) {
			if(name.containsKey(entry.getValue())) {
				System.out.println(entry.getValue()+","+name.get(entry.getValue())+","+entry.getKey());
			}
		}
		
		for(Map.Entry<Double, Integer>entry:mymap.entrySet()) {
			Double k=(entry.getKey()*0.01)+(entry.getKey());
			incr.put(k, entry.getValue());
		}
		
		System.out.println("After incrementing the salary");
		for(Map.Entry<Double, Integer>entry:incr.entrySet()) {
			if(name.containsKey(entry.getValue())) {
				System.out.println(entry.getValue()+","+name.get(entry.getValue())+","+entry.getKey());
			}
		}
		
		for(Map.Entry<Double, Integer>entry:mymap.entrySet()) {
			Double k=entry.getKey();
			if(k<30000) {
				less.put(entry.getValue(),k);
			}
			if(k>=30000 && k<=60000) {
				eq.put(entry.getValue(),k);
			}

			if(k>60000) {
				more.put(entry.getValue(),k);
			}

		}
		
		System.out.println("After Ranging: ");
		
		System.out.println("People who's salary are less then 30000");
		
		for(Map.Entry<Integer,Double>entry:less.entrySet()) {
			if(name.containsKey(entry.getKey())) {
				System.out.println(entry.getKey()+","+name.get(entry.getKey())+","+entry.getValue());
			}
		}
		
		System.out.println("People who's salary are greater then 30000 and less then 60000 showed by id");
		for(Map.Entry<Integer,Double>entry:eq.entrySet()) {
			if(name.containsKey(entry.getKey())) {
				System.out.print(entry.getKey()+","+name.get(entry.getKey())+","+entry.getValue());
			}
		}
		System.out.println("People who's salary are greater then 60000 showed by id");
		for(Map.Entry<Integer,Double>entry:more.entrySet()) {
			if(name.containsKey(entry.getKey())) {
				System.out.print(entry.getKey()+","+name.get(entry.getKey())+","+entry.getValue());
			}
		}
		
	}

}
