
package Prev18;

import java.util.Scanner;

class Pow{
	public int a,b,sum=1;
	Pow(int i,int j){
		a=i;
		b=j;
	}
	public int pow() {
		for(int i=1;i<=b;i++) {
			sum=b*sum;
		}
		return sum;
	}
	
}


public class Q3_c_2021 {

	public static void main(String[] args) {
		Pow obj=new Pow(2,3);
		System.out.println(obj.pow());

	}

}
