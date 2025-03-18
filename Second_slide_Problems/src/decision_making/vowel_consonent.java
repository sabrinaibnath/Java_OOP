package decision_making;

import java.util.Scanner;

class vowel{
	char c;
	vowel(char v){
		c=v;
	}
	void show() {
		if((c =='a') | (c =='e')| (c =='i')|(c =='o')|(c =='u')|(c =='A') | (c =='E')| (c =='I')|(c =='O')|(c =='U') ) {
			System.out.println("it is a vowel");
		}
		else {
			System.out.println("it is a consonent");
		}
	}
}
public class vowel_consonent {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please enter a character");
		char n=in.next().charAt(0);
		vowel obj=new vowel(n);
		obj.show();
		
	}

}
