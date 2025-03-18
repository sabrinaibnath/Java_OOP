class car{
	String make,model;
	int year;
	car(String s,String m,int y){
		make=(s==null|s.isEmpty())?"unknown MAke":s;
		model=(m==null|m.isEmpty())?"unknown model":m;
		year=(y<=0)?2000:year;
	}
}
public class problem7 {

	public static void main(String[] args) {
	car c=new car("","no",2023);
	System.out.println(c.make+" "+c.model+" "+c.year);
	

	}

}
