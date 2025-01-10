package Previous_Year22;

import java.io.*;

public class Section1_Probelm2_1 {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Collection_frameWork/src/Previous_Year22/S1_Problem2.txt");
		
		BufferedReader re=null;
		String line;
		int largest=0;
		String ans="";
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split(" ");
				
				for(String word:arr) {
					if(word.length()>largest) {
						largest=word.length();
						ans=word;
					}
				}
			}
			System.out.println(ans);
			re.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
