import java.util.Scanner;
import java.util.Vector;

public class LargestValue {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>();
		
		Scanner in=new Scanner(System.in);
		Integer Lar=0;
		for(int i=0;i<5;i++) {
			Integer o=in.nextInt();
			v.add(o);
			if(Lar<v.get(i)) {
				Lar=v.get(i);
			}
		}
		System.out.println(Lar);
		in.close();
	}

} 
