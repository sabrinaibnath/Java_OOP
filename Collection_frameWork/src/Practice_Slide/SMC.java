package Practice_Slide;

import java.util.Scanner;

public class SMC {

	public static void main(String[] args) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		s2=in.nextLine();
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		//System.out.println(a1);
		//System.out.println(a2);
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]=='0' && a2[i]=='1') {
				count1++;
			}
			if(a1[i]=='1' && a2[i]=='0') {
				count2++;
			}
			if(a1[i]=='0' && a2[i]=='0') {
				count3++;
			}
			if(a1[i]=='1' && a2[i]=='1') {
				count4++;
			}
		}
		//System.out.println(count1);
		//System.out.println(count2);
		//System.out.println(count3);
		//System.out.println(count4);
		int up=count3+count4;
		int be=count1+count2+count3+count4;
		System.out.println((double)up/(double)be);
	}

}
