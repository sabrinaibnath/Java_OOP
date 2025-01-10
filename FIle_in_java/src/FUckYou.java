import java.util.Scanner;
import java.io.*;
public class FUckYou {

	public static void main(String[] args) {
		
		File outl=new File("data.txt");
		FileReader re=null;
		FileWriter we=null;
		int c;
		 try {
			we=new FileWriter(outl);
			 for(int i=1;i<=100;i++) {
				 we.write((int)( Math.random()*100));
			 }
			 we.close();
		 }
		 catch(IOException e) {
			 System.out.println(e);
		 }
		try {
			re=new FileReader(outl);
			while((c=re.read())!=-1) {
				System.out.println(c);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	

}
