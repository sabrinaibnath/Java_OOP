import java.util.Scanner;
import java.util.Stack;

public class Problem2 {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		System.out.println("please enter your string:");
		s=in.nextLine();
		char[] s2=s.toCharArray();
		Stack<Character>s1=new Stack<>();
		
		for(int i=s2.length-1;i>=0;i--) {
			  if (!s1.empty() && s2[i]==s1.peek() )  {
				   s1.pop();
			}
			  else {
				  s1.push(s2[i]);
			  }
		}
		
		if(s1.empty()) {
			System.out.println("the string is empty");
		}
		else {
			while(!s1.empty()) {
				System.out.print(s1.peek());
				s1.pop();
			}
		}
		
		in.close();
	}

}
