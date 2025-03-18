class Calculator{
	int a, b;
	Calculator(int n1,int n2){
		a=n1;
		b=n2;
	}
 int add() {
	return a+b; 
 }
 int add(int k, int j) {
	 return k+j;
 }
 int add(int f) {
	 return a+f+b;
 }
}
public class Q1_b_Poly {

	public static void main(String[] args) {
	   Calculator obj=new Calculator(3,4);
	   System.out.println(obj.add());
	   System.out.println(obj.add(5, 5));
	   System.out.println(obj.add(6));

	}

}
