import java.util.*;

public class Insertion_sort {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("please enter the size:");
	int size=in.nextInt();
	int[] data=new int[size];
	
	
	for(int i=0;i<size;i++) {
		data[i]=in.nextInt();
	}
	
	for(int i=1;i<size;i++) {
		int key=data[i];
		int j=i-1;
		while(j>=0 && data[j]>key) {
			data[j+1]=data[j];
			j=j-1;
		}
		data[j+1]=key;
	}
	for(int i=0;i<size;i++) {
		System.out.println(data[i]);
	}

	}

}
