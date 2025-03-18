package File;

import java.io.*;

public class Count_Words_From_File {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Practise/Out.txt");
		
		BufferedReader re=null;
		String line="";
		String word="";
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((word=re.readLine())!=null) {
				line+=word+" ";
			}
			String[] arr=line.split(" ");
			System.out.println(arr.length);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			re.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
