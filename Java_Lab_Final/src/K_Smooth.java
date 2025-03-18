import java.util.LinkedList;
import java.util.Scanner;

public class K_Smooth {

	public static void main(String[] args) {
		int k, num;
		Scanner in=new Scanner(System.in);
		k=in.nextInt();
		num=in.nextInt();
		
		int count=0,count1=0;
		LinkedList<Integer>l=new LinkedList<>();
		
		for(int i=k+1;i<num;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				l.add(i);
			}
		}
		for(int n:l) {
			if(num%n==0) {
				count1++;
			}
		}
		if(count1==0) {
			System.out.println("it's a smooth");
		}
		else {
			System.out.println("noy");
		}
	}

}
