import java.io.*;
import java.util.Arrays;

public class Q7_a {

	public static void main(String[] args) {
		File infile=new File("C://Users//Acer//eclipse-workspace//Previous_year22//src//input.txt");
		 BufferedReader re=null;
		 
		 try {
			 re=new BufferedReader(new FileReader(infile));
			 String word="";
			 
			
			 while((word=re.readLine())!=null) {
				 String[] data;
				 data=word.split(",");
				 int sum=0;
				 for(int i=0;i<data.length;i++) {
				  sum=sum+Integer.parseInt(data[i]);
				 }
				 System.out.println(sum);
				 
			 }
		 }
		 catch(IOException e) {
			 System.out.println(e);
		 }
		 finally {
			 try {
			 re.close();
			 }catch(IOException e) {
				 System.out.println(e);
			 }
		 }
	}

}
