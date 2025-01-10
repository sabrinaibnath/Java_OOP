import java.io.*;

public class File_problem12 {

	public static void main(String[] args) {
		File inf=new File("input.txt");
		BufferedReader re=null;
		
		try {
			re=new BufferedReader(new FileReader(inf));
			String s1="";
			String s2="";
			while((s1=re.readLine())!=null) {
				s2+=s1+" ";
				
			}
			String[] data=s2.split(" ");
			int count=data.length;
			System.out.print(count);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
