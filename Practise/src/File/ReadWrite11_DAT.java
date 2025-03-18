package File;

import java.io.*;

public class ReadWrite11_DAT {

	public static void main(String[] args) {
		File inp=new File("C:/Users/Acer/eclipse-workspace/Practise/Dat.dat");
		File outs=new File("C:/Users/Acer/eclipse-workspace/Practise/OUT.dat");
		
		FileReader ins=null;
		FileWriter wri=null;
		
		try {
			ins=new FileReader(inp);
			wri=new FileWriter(outs);
			int c;
			while((c=ins.read())!=-1) {
				wri.write(c);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
			ins.close();
			wri.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}

}
