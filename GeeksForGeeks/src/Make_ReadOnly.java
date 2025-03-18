
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Make_ReadOnly {

	public static void main(String[] args) {
		List<String>l=new ArrayList<>();
		
		l.add("Sab");
		l.add("rina");
		l.add("Ib");
		
		try {
			l=Collections.unmodifiableList(l);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(l);
	}

}
