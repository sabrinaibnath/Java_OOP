import java.util.HashMap;
import java.util.Scanner;

public class Q7_b {

	public static void main(String[] args) {
		HashMap<Integer,String>Book=new HashMap<>();
		Book.put(101,"Structure Programming");
		Book.put(102,"Algorithm");
		Book.put(103,"Operating System");
		
		Scanner in=new Scanner(System.in);
		int find=in.nextInt();
		if(Book.containsKey(find)) {
			System.out.println(Book.get(find));
		}
		else {
			System.out.println("Book not found");
		}
	}

}
