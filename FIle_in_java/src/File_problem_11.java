import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class File_problem_11 {

	public static void main(String[] args) {
		File infile=new File("input.txt");
		File outfile=new File("output.txt");
		
		FileReader re=null;
		
		FileWriter we=null;
		
		
		try {
			re=new FileReader(infile);
			we=new FileWriter(outfile);
			int ed;
			while((ed = re.read())!=-1) {
				 we.write((char) ed);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				re.close();
				we.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}

}
