package Map;
import java.util.*;
public class SMC_pro {

	public static void main(String[] args) {
		
		String s1,s2;
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the first input:");
		s1=in.nextLine();
		char[] ar1=s1.toCharArray();
		
		
		System.out.println("enter the second input:");
		s2=in.nextLine();
		char[] ar2=s2.toCharArray();
		
		
		
		int n1 = 0,n2=0,n3=0,n4=0;
		
		
		for(int i=0;i<ar2.length;i++) {
			if(ar1[i]=='1' && ar2[i]=='0') {
				n1=n1+1;
			}
			else if(ar1[i]=='0' && ar2[i]=='0') {
				n2++;
			}
			else if(ar1[i]=='0' && ar2[i]=='1') {
				n3++;
			}
			else if(ar1[i]=='1' && ar2[i]=='1') {
				n4++;
			}
		}
		double n=(n4+n2);
		double ni=(n1+n2+n3+n4);
		double re=n/ni;
		System.out.println(re);
	}

}
