package File;

import java.io.*;

public class InputStream_Problem12 {

	public static void main(String[] args) {
	
		File infile=new File("C:/Users/Acer/eclipse-workspace/Practise/Dat.dat");
		File outfile=new File("C:/Users/Acer/eclipse-workspace/Practise/OUT.dat");
		
		FileInputStream re=null;
		FileOutputStream we=null;
		
		try {
			re=new FileInputStream(infile);
			we=new FileOutputStream(outfile);
			
			byte e;
			while((e=(byte) re.read())!=-1) {
				we.write(e);
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
