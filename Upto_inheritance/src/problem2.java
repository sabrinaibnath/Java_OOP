import java.util.Scanner;

class dog{
	String name,color;
	dog(String n, String c){
		name=n;
		color=c;
	}
	String getName() {
		return name;
	}
	String getColor(){
		return color;
	}
}
public class problem2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n,c;
		n=in.nextLine();
		c=in.nextLine();
		dog obj=new dog(n,c);
		System.out.println(obj.getName());
		System.out.println(obj.getColor());
	}

}
