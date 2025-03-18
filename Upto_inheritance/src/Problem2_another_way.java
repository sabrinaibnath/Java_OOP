import java.util.Scanner;

class doggy{
	String name,color;
	doggy(String n,String c){
		name=n;
		color=c;
	}
	void show() {
		System.out.println(name);
		System.out.println(color);
	}
}
public class Problem2_another_way {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String n,c;
		n=inp.nextLine();
		c=inp.nextLine();
		doggy no=new doggy(n,c);
		no.show();
		
	}

}
