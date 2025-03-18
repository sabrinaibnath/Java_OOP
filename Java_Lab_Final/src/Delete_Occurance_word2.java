import java.util.Scanner;

public class Delete_Occurance_word2 {

	public static void main(String[] args) {
		String str;
		char word;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		word=in.next().charAt(0);
		
		char[] arr=str.toCharArray();
		
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			if(arr[i]==word) {
				for(int j=i;j<len-1;j++) {
					arr[j]=arr[j+1];
				}
				len--;
				i--;
			}
		}
		
		String result=new String(arr,0,len);
		System.out.println(result);
		in.close();
	}

}
