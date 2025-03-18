import java.util.Stack;

public class Probelm1_1 {

	public static void main(String[] args) {
		Stack<String>mys=new Stack<>();
		
		mys.push("Technical");
        mys.push("Interview");
        mys.push("Preparation");
        
        while(!mys.empty()) {
        	System.out.print(mys.pop()+" ");
        }
	}

}
