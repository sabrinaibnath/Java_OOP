package Prev18;

import java.io.*;
import java.util.Scanner;

public class Q7_b_21 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Previous_year22/src/Prev18/Data.Dat");
		FileOutputStream we=null;
		byte b;
		Scanner in=new Scanner(System.in);
		int id=in.nextInt();
		String name=in.nextLine();
		
		try {
			we.write((id+" ").getBytes());
			we.write((name+" ").getBytes());
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
