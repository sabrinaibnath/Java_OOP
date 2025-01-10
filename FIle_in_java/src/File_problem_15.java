import java.io.*;
import java.util.Scanner;

public class File_problem_15 {

	public static void main(String[] args) {
		File outfile=new File("input.txt");
		FileWriter we=null;
		
		try {
			we=new FileWriter(outfile);
			Scanner inp=new Scanner(System.in);
			String line=inp.nextLine();
			we.write(line);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				we.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}

	}

}
