import java.io.*;

public class File_problem_13 {

	public static void main(String[] args) {
		File infile=new File("num.txt");
		File outfile1=new File("even.txt");
		File outfile2=new File("odd.txt");
		
		BufferedReader re=null;
		FileWriter we1=null;
		FileWriter we2=null;
		
		try {
			re=new BufferedReader(new FileReader(infile));
			we1=new FileWriter(outfile1);
			we2=new FileWriter(outfile2);
			String li="";
			String data="";
			while((li=re.readLine())!=null) {
				data+=li+" ";
			}
			System.out.println(data);
		
			String[] s=data.split(" ");
			int w;
			for(int i=0;i<s.length;i++) {
				w=Integer.parseInt( s[i]);
				if(w%2==0) {
					we1.write(w+ " ");
				}
				else {
					we2.write(w+" ");
				}
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				re.close();
				we1.close();
				we2.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}

}
