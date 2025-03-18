package Chapter8_4;

import java.time.LocalDate;

class Arr{
	public static <Thing extends Comparable> Thing min(Thing[] a){
		if(a==null || a.length==0) {
			return null;
		}
		Thing min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min.compareTo(a[i])>0) {
				min=a[i];
			}
		}
		return min;
		
	}
}
public class Bounds_For_Type_Variable {

	public static void main(String[] args) {
		LocalDate[] bi= {
				LocalDate.of(1902,02,9),
				LocalDate.of(1909,11,11),
				LocalDate.of(1999,02,9),
				
		};
		LocalDate mm=Arr.min(bi);
		System.out.println(mm);
	}

}
