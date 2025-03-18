package Encapsulation_Java;

import java.util.Scanner;

class Repre{
	//data are hidden
	private String name;
	private String sems;
	
	Repre(String n1,String n2){// we can discard this part but it's ok
		name=n1;
		sems=n2;
	}
	
	//public String getName() {// we can access the hidden data through public methods
	//	return name;
	//}
	
//	public void setName(String n) {//modify name without creating obj
//		name=n;
//	}
//	public String getSems() {
//		return sems;
//	}
//	public void setsmes(String c) {
//		sems=c;
//	}
	
}
public class Encap_demo {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String name,sems;
		name=inp.nextLine();
		sems=inp.nextLine();
		Repre obj= new Repre(name,sems);
		//System.out.println(obj.getName()+":"+obj.getSems());
		
	}

}
