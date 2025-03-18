package Encapsulation_java;

import java.util.Scanner;

class Representative{
	// data are hidden
	private String name;
	private String sems;
	
	Representative(String n1,String n2){
		name=n1;
		sems=n2;
	}
	
	public String getName() {
		return name;
	}
		public void setName(String n) {
		name=n;
	}

		public String getSems() {//used to modify without creating new obj
			return sems;
		}
		
		public void setSems(String s) {
			sems=s;
		}
	
}
public class Demo_Encap {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String n,s;
		n=inp.nextLine();
		s=inp.nextLine();
		Representative obj= new Representative(n,s);
		System.out.println(obj.getName()+":"+obj.getSems());

	}

}
