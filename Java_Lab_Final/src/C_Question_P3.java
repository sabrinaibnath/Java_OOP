import java.util.Scanner;

public class C_Question_P3 {
    
	void Valid(String st) {
		String[] arr=st.split(" ");
		
		int k=0;
		int hsc=Integer.parseInt(arr[3].trim());
		int ssc=Integer.parseInt(arr[6].trim());
		int h=hsc-ssc;
		
		
		String b ="CU";
		String u =arr[1];
		String u1 =arr[4];
		int l=u.length();
		int l1=u1.length();
		
		System.out.println(u);
		System.out.println(u1);
		
		if(b.equals("CU")) {
			k++;
		}
		if(l==l1) {
			k++;
		}
		if(h==2) {
			k++;
		}
		if(u.equals(u.toUpperCase()) && u1.equals(u1.toUpperCase())) {
			k++;
		}
		
		if(k==4) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not Valid");
		}
		
	}
	public static void main(String[] args) {
		String inp;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your  string:");
		inp=in.nextLine();

		C_Question_P3 obj=new C_Question_P3();
		obj.Valid(inp);
		in.close();
	}

}
