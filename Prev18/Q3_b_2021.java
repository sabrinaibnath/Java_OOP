package Prev18;
class Min{
	int min(int a,int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	int min(int a,int b,int c) {
		if(a<b && a<c) {
			return a;
		}
		else if(b<a && b<c) {
			return b;
		}
		else {
			return c;
		}
	}
}
public class Q3_b_2021 {

	public static void main(String[] args) {
		Min Obj=new Min();
		int j=Obj.min(2, 3);
		System.out.println(Obj.min(3, 5, 1));
		System.out.println(j);

	}

}
