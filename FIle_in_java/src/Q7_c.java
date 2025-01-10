import java.io.*;
import java.util.*;

public class Q7_c {

	public static void main(String[] args) {
		File infile=new File("C://Users//Acer//eclipse-workspace//Previous_year22//src//data.txt");
		File outfile=new File("C://Users//Acer//eclipse-workspace//Previous_year22//src//input.txt");
		FileWriter we=null;
		BufferedReader re=null;
		ArrayList<Double>data=new ArrayList<>();
		ArrayList<Double>data1=new ArrayList<>();
		try {
			re=new BufferedReader(new FileReader(infile));
			double c;
			String line;
			while((line=re.readLine())!=null) {
				double v=Double.parseDouble(line);
				data.add(v);
			}
			data1.addAll(data);
			Collections.reverse(data1);
			System.out.println(data1);
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
			
			try {
				we=new FileWriter(outfile);
				for(Double b:data1) {
					we.write(b+" ");
				}
			}
			catch(IOException e) {
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


