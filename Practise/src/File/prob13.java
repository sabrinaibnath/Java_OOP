package File;

import java.io.*;


public class prob13 {
  public static void main(String args[]) {
	File inp=new File("C:/Users/Acer/eclipse-workspace/Practise/data.txt");
	File ev=new File("C:/Users/Acer/eclipse-workspace/Practise/even.txt");
	File odd=new File("C:/Users/Acer/eclipse-workspace/Practise/odd.txt");
	
	BufferedReader ins=null;
	FileWriter wriO=null;
	FileWriter wroE=null;
	
	try {
		ins=new BufferedReader(new FileReader(inp));
		wriO=new FileWriter(odd);
		wroE=new FileWriter(ev);
		
		String deli="";
		String i="";
		while((i=ins.readLine())!=null) {
			deli+=i+" ";
		}
		String delim=" ";
		String [] no=deli.split(delim);
		int w;
		for(int j=0;j<no.length;j++) {
			w=Integer.parseInt(no[j]);
			if(w%2==0) {
				wroE.write(w+" ");
			}
			else {
				wriO.write(w+" ");
			}
		}
	}
	catch(IOException e) {
		System.out.println(e);
	}
	finally {
		try {
			wriO.close();
			wroE.close();
			ins.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
  }
}
