import java.util.Scanner;

@FunctionalInterface
interface myin{
	public void me();
}
interface myv{
	public void name(String n1);
}
public class Lbasic {

	public static void main(String[] args) {
		//this is the treditional way to implement interface
	     //myin obj=new myin() { 
			  //public void me() { 
				//  System.out.println("hi"); } 
			  //};
		 
         // with lembda
		myin ob=()-> {System.out.println("hi");
		System.out.println("noki");
		};
		
		ob.me();
		String n;
		Scanner in=new Scanner(System.in);
		n=in.nextLine();
		myv onj=(x)->{
			System.out.println(x);
		};
		onj.name(n);
	}

}
