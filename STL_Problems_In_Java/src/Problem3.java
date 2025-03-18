import java.util.Scanner;
import java.util.Stack;

public class Problem3 {

	public static void main(String[] args) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter your strings:");
        s1=in.nextLine();
        s2=in.nextLine();
        
        char[] myc1=s1.toCharArray();
        char[] myc2=s2.toCharArray();
    
        Stack<Character>mys=new Stack<>();
        Stack<Character>mys2=new Stack<>();
        
        
        
        for(int i=0;i<myc1.length;i++){
    		if(!mys.empty() && myc1[i]=='#'){
    			mys.pop();
    		}
    		else{
    			mys.push(myc1[i]);
    		}
    	}
        for(int i=0;i<myc2.length;i++){
    		if(!mys2.empty() && myc2[i]=='#'){
    			mys2.pop();
    		}
    		else{
    			mys2.push(myc2[i]);
    		}
    	}
        if(mys.equals(mys2)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
        
	}

}
