package CollectionFrameWork;
import java.util.*;

public class ArrayList_ALL {

	public static void main(String[] args) {
		List<String>mylist=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.nextLine();
		String n;
	 for(int i=0;i<=num;i++) {
	    n=in.nextLine();
		mylist.add(n);}
	 System.out.println(mylist);
	 for(String word:mylist) {
		 System.out.println(word);
	 }
	 mylist.add(1,"sabrina");
	 System.out.println(mylist);
	 boolean n2=mylist.contains("sabrina");
	 System.out.println(n2);
	 mylist.clear();
	 String color[]= {"red","blue","black"};
	 List no=new ArrayList(Arrays.asList(color));
	 System.out.println(no);
	}

}
