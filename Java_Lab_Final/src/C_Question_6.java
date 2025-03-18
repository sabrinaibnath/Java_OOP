import java.util.ArrayList;

public class C_Question_6 {

	public static void main(String[] args) {
		String str1="WINKLER";
		String str2="WELFARE";
		
		double m=0,n=0;
		int s1=str1.length();
		int s2=str2.length();
		double t=0.0,jaro=0.0;
		
		ArrayList<Character> c1=new ArrayList<>();
		ArrayList<Character>c2=new ArrayList<>();
		

		boolean[] S1Match=new boolean[s1];
		boolean[] S2Match=new boolean[s2];
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;i<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j) && S2Match[j]!=true) {
					S1Match[i]=true;
					S2Match[i]=true;
					m++;
					break;
				}
			}	
		}
		for(int i=0;i<s1;i++) {
			if(S1Match[i]) {
				c1.add(str1.charAt(i));
			}
		}
		for(int j=0;j<s2;j++) {
			if(S1Match[j]) {
				c1.add(str1.charAt(j));
			}
		}
		for(int i=0;i<c1.size();i++) {
			if(c1.get(i)!=c2.get(i)) {
				n++;
			}
		}
		t=n/2.0;
		if(m!=0) {
			jaro=((m/s1)+(m/s2)+((m-t)/m))/3.00;
		}
		System.out.println(jaro);
	}

}
