package Generic_Basic;

public class Y_Generic {
	public static <Thing> void Display(Thing[] A) {
		for(Thing x:A) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static <Thing>Thing Value1(Thing[] arr){
		return arr[0];
}
	
    public static void main(String[] args) {
	Integer[] intArray= {1,2,3,4,5};
	Double[] doubleArray= {1.1,1.2,2.1,2.2};
	Character[] charAraay= {'A','B','C','D'};
	String[] strArray= {"a","b","c"};
	Display(intArray); //all of this is generic methods. here <thing> will accept parameter of any datatype
	Display(doubleArray);
	Display(charAraay);
	Display(strArray);
	System.out.println(Value1(intArray)+" this is from value");
	}
	
}
