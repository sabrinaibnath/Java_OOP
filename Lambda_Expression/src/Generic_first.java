//interface addition{
//
	//abstract void show();
//}
interface mul{
	 int add(int a,int b);
}
public class Generic_first {

	public static void main(String[] args) {
		
		
		mul obj2=(i,j)->i+j;
		
		int num=obj2.add(4, 7);
		System.out.println(num);
	}

}
