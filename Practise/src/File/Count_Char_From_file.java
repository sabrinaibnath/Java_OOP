package File;

import java.io.File;
import java.io.*;

public class Count_Char_From_file {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Practise/Out.txt");
		
		String word="";
		String line="";
		BufferedReader re=null;
		int count=0;
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((word=re.readLine())!=null) {
				line+=word+" ";
			}
			char[] b=line.toCharArray();
			for(int i=0;i<b.length;i++) {
				if(b[i]!=' ') {
					count++;
				}
			}
			System.out.println(count);
		}catch(Exception e) {
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
