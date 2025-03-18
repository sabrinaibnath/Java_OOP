package CollectionFrameWork;

import java.util.*;

public class SetAll {

	public static void main(String[] args) {
		Set<String>myset=new HashSet<String>();
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.nextLine();
		for(int i=1;i<=n;i++) {
			String no;
			no=in.nextLine();
			myset.add(no);
		}
		Iterator<String>itr=myset.iterator();
		while(itr.hasNext()) {
			String f=itr.next();
			System.out.println(f);
		}
		//int result=Collections.indexedBinarySearch(myset, "sabrina"); is not aplicable cause it's a set,only applicable when we are using list

	}

}
