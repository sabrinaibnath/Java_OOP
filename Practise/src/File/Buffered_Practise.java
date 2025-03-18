package File;

import java.io.*;

public class Buffered_Practise {

	public static void main(String[] args) {
		File infile=new File("num.txt");
		File evenF=new File("even.txt");
		File oddF=new File("odd.txt");
		
		BufferedReader re=null;
		FileWriter Even=null;
		FileWriter Odd=null;
		
		try {
			re=new BufferedReader( new FileReader(infile));
		    Even=new FileWriter(evenF);
			Odd=new FileWriter(oddF);
			
			String line="";
			String word="";
			while((word=re.readLine()) != null) {
				line+=word+" ";
			}
			String[] arr=line.split(" ");
			int number;
			for(int i=0;i<arr.length;i++) {
				 number=Integer.parseInt( arr[i]);
				if(number%2==0) {
					Even.write(number+" ");
				}
				else {
					Odd.write(number+" ");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		try {
			Even.close();
			Odd.close();
			re.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
