import java.io.*;

public class File_problem_16 {
 public static void main(String[] args) {
	 File inf=new File("input.txt");
	 FileReader we=null;
	 
	 try {
		 we=new FileReader(inf);
		 int c,count=0;
		 while((c=we.read())!=-1) {
			 if(c!=' ') {
			 count++;
			 }
		 }
		 System.out.println(count);
		 
	 }
	 catch(IOException e) {
		 System.out.println(e);
	 }
	 
 }
}
