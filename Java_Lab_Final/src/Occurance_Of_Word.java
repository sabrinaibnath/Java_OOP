import java.util.Scanner;

public class Occurance_Of_Word {

	public static void main(String[] args) {
		String i;
		char o;
		Scanner in=new Scanner(System.in);
		i=in.nextLine();
		o=in.next().charAt(0);
		
		char[] arr=i.toCharArray();
		
		int l=i.length();
		int newl=0;
		
		char[] result=new char[l];
		
		
		for(int j=0;j<l;j++) {
			if(arr[j]!=o) {
				result[newl++]=arr[j];
				}
			}
			String output=new String(result,0,newl);
			System.out.println(output);
	in.close();
	}

}
