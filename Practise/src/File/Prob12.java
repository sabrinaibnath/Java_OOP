package File;

import java.io.*;

public class Prob12 {

	public static void main(String[] args) {
		FileInputStream ins=null;
		FileOutputStream out=null;
		
		byte c;
		
		try {
			ins=new FileInputStream("C:/Users/Acer/eclipse-workspace/Practise/Dat.dat");
			out=new FileOutputStream("C:/Users/Acer/eclipse-workspace/Practise/OUT.dat");
			
			while((c=(byte) ins.read())!=-1) {
				out.write(c);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				ins.close();
				out.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}

	}

}
