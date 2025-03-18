package File;

import java.io.*;

public class FileReader_Problem11 {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Practise/Dat.dat");
		File outfile=new File("C:/Users/Acer/eclipse-workspace/Practise/OUT.dat");
		
		FileReader re=null;
		FileWriter we=null;
		int c;
		
		try {
			re=new FileReader(infile);
			we=new FileWriter(outfile);
			
			while((c=re.read())!=-1){
				we.write(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			re.close();
			we.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}

}
