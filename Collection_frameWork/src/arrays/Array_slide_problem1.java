package arrays;

import java.util.Arrays;

class usingArray{
	int intValues[]= {1,2,3,4,5,6};
	double doubleValues[]= {8.4,9,3,0.2,7.9,3.4};
	int a2[],a3[];
	usingArray(){
		a2=new int[10];
		Arrays.fill(a2, 7);
		a3=new int[intValues.length];
		Arrays.sort(doubleValues);
		System.arraycopy(intValues, 0, a3,0, intValues.length);
	}
	public void printArrays()
	{
		System.out.println("doubleValues:");
		for(int i=0;i<doubleValues.length;i++) {
			System.out.println(doubleValues[i]+" ");
		}
		
		System.out.println("\nintValues");
		for(int i=0;i<intValues.length;i++) {
			System.out.println(intValues[i]);
		}
		System.out.println("\na2Values");
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		System.out.println("\na4Values");
		for(int i=0;i<a3.length;i++) {
			System.out.println(a3[i]);
		}
		
	}
	public int SearchFOr(int value) {
		return Arrays.binarySearch(intValues, value);
	}
	public void printEquality() {
		boolean b=Arrays.equals(intValues, a2);
		System.out.println( "intValues " + ( b ? "==" : "!=" ) +
				             " a2" );
				   
				          b = Arrays.equals( intValues, a3 );
				    
			          System.out.println( "intValues " + ( b ? "==" : "!=" ) +
				             " a3" );

	}
}
public class Array_slide_problem1 {

	public static void main(String[] args) {
	usingArray a= new usingArray();
	a.printArrays();
	a.printEquality();

	}

}
