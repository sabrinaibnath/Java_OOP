import java.util.Scanner;

public class C_Question_P2 {

	public static void main(String[] args) {
		String s;
		int x,y;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		char[] arr=s.toCharArray();
		x=in.nextInt();
		y=in.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='R') {
				x=x+1;
			}
			else if(arr[i]=='U') {
				y=y+1;
			}
			else if(arr[i]=='D') {
				y=y-1;
			}
			else if(arr[i]=='L') {
				x=x-1;
			}
		}
		System.out.println(x+" "+y);
		in.close();
	}

}
