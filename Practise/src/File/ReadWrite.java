package File;

import java.io.*;

public class ReadWrite {

	public static void main(String[] args) {
		File in=new File("C://Users//Acer//eclipse-workspace//Practise//Inp.txt");//create an object(in) that will represent the inp file
	    File ou=new File("C:/Users/Acer/eclipse-workspace/Practise/Out.txt");//create an object(ou)which will represent output file
		
		FileReader ins=null;//create obj ins to read input file(inp)
		FileWriter out=null;//create obj out to write output filr(out)
		
		try {
			ins=new FileReader(in);//ins is initialized with input file(in)
			out=new FileWriter(ou);//out is initialized with output file(out)
			
			int c;
			while((c= ins.read())!=-1) {//read character from the input file one at a time and stores it in c
				out.write(c);//write the character of c in the output file ou
			}
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			try {
			ins.close();//closing the filereader cause if we don't then we cannot do the work 
			out.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}
	}

}
