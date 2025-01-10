import java.io.*;
public class File_problem_12 {

	public static void main(String[] args) {
		FileInputStream infile=null;
		FileOutputStream outfile=null;
		
		byte re;
		try {
			infile=new FileInputStream("file_a.dat");
			outfile=new FileOutputStream("file_b.dat");
			
			do {
				re=(byte)infile.read();
				outfile.write(re);
				
			}
			while(re!=-1);
		}
		catch(IOException e) {

			System.out.println(e);
		}
		finally {
			try {
				infile.close();
				outfile.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
			

	}

}
