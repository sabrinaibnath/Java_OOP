import java.util.Scanner;

public class Q1_P2 {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		
		String[] arr=s.split(" ");
		int l=arr[0].length();
		String re="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>l) {
				l=arr[i].length();
				re=arr[i];
			}
		}
		System.out.println(re);
		in.close();
	}

}
