package Previous_Year22;

import java.io.*;

public class Section1_Problem2 {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Collection_frameWork/src/Previous_Year22/S1_Problem2.txt");
		
		BufferedReader re=null;
		String line;
		String[] arr=null;
		try {
			re=new BufferedReader(new FileReader(infile));
			while((line=re.readLine())!=null) {
				 arr=line.split(" ");
				 
			}
		     int largest=arr[0].length();
			
			String n=null;
			for(int i=0;i<arr.length;i++) {
				if(largest<=arr[i].length()) {
					largest=arr[i].length();
					n=arr[i];
				}
			}
			System.out.println(n);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
