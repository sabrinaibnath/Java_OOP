import java.util.Scanner;

public class Smc {
     void SMC(String str1,String str2) {
    	 char[] arr1=str1.toCharArray();
    	 char[] arr2=str2.toCharArray();
    	 
    	 int F01=0,F10=0,F11=0,F00=0;
    	 for(int i=0;i<arr1.length;i++) {
    		 if(arr1[i]=='0' && arr2[i]=='1') {
    			 F01++;
    		 }
    		 else if(arr1[i]=='1' && arr2[i]=='0') {
    			 F10++;
    		 }
    		 else if(arr1[i]=='1' && arr2[i]=='1') {
    			 F11++;
    		 }
    		 else if(arr1[i]=='0' && arr2[i]=='0') {
    			 F00++;
    		 }
    	 }
    	 double up=(double)(F11+F00);
    	 double dow=(double)(F11+F00+F01+F10);
    	 System.out.println(up/dow);
     }
	public static void main(String[] args) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter your string: ");
		s1=in.nextLine();
		
		System.out.println("please enter your string: ");
		s2=in.nextLine();
		
		Smc obj=new Smc();
		obj.SMC(s1,s2);
		
		in.close();
	}

}
