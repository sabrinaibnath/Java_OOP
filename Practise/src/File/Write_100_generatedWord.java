package File;

import java.io.*;

public class Write_100_generatedWord {

	public static void main(String[] args) {
		File outfile=new File("written.txt");
		
		FileWriter we=null;
		FileReader re=null;
		try {
			we=new FileWriter(outfile);
			
			for(int i=1;i<=100;i++) {
				we.write((int)(Math.random()*100));
			}
			we.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			re=new FileReader(outfile);
			
			int d;
			while((d=re.read())!=-1) {
				System.out.println(d);
			}
			re.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
