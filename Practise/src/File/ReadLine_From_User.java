package File;

import java.io.*;
import java.util.Scanner;

public class ReadLine_From_User {

	public static void main(String[] args) {
		String line;
		Scanner in=new Scanner(System.in);
		line=in.nextLine();
		
		File outfile=new File("C:/Users/Acer/eclipse-workspace/Practise/Out.txt");
		FileWriter we=null;
		try {
			we=new FileWriter(outfile);
			we.write(line);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			we.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
