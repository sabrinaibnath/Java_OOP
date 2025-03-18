import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem1 {

	public static void main(String[] args) {
	  ArrayList<String>l1=new ArrayList<>(Arrays.asList("Technical","Interview","Preparation"));
	  
	  Collections.reverse(l1);

	  System.out.println(l1);
	}

}
