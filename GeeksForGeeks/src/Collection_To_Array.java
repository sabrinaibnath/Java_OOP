import java.util.ArrayList;

public class Collection_To_Array {

	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<>();
		
		l.add("Noki");
		l.add("no moew");
		
		String[] sr=l.toArray(new String[0]);
		
		for(String word:sr) {
			System.out.println(word);
		}
	}

}
