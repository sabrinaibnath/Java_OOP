import java.io.*;
import java.util.Set;

public class File_problem_18 {

	public static void main(String[] args) {
		File inf=new File("data.txt");
		FileWriter we=null;
		FileReader re=null;
		
		try {
			we=new FileWriter(inf);
			for(int i=1;i<=100;i++) {
				we.write((int)(Math.random()*100));
			}
			we.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		try {
			re=new FileReader(inf);
			int c;
			
			while((c=re.read())!=-1) {
				System.out.println(c+" ");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
