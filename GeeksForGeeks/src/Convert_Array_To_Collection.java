import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_Collection {

	public static void main(String[] args) {
		
		
		String[] names= {"Sabrina","Ibnath","Nowshed","Chowdory"};
		
        @SuppressWarnings("rawtypes")
		List l1=Arrays.asList(names);
        
        System.out.println(l1);
	}

}
