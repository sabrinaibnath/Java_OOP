import java.util.Arrays;

public class Array_Operations {

	public static void main(String[] args) {
		int[] intV= {1,2,3,4,5};
		double[] douV= {1.5,0.2,3.3,4.9,0.5};
		
		int fillInt[],copyInt[];
		 fillInt=new int[10];
		 copyInt=new int[intV.length];
		 
		 Arrays.fill(fillInt, 7);
		 
		 Arrays.sort(douV);
		 for(double d:douV) {
			 System.out.print(d+" ");
		 }
		
		 
		 System.arraycopy(intV, 0, copyInt,0, intV.length);
		 
		System.out.println(Arrays.binarySearch(intV,2));
		
		System.out.println(Arrays.equals(intV, copyInt));
		 
	}

}
