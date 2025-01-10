package Map;

import java.io.*;
import java.util.*;

public class File_Problem {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Double>old=new LinkedHashMap<>();
		LinkedHashMap<Integer,Double>tra=new LinkedHashMap<>();
		
		File inf1=new File("oldmast.txt");
		File inf2=new File("trans.txt");
		
		FileReader re=null;
		FileReader re2=null;
		try {
			re=new FileReader(inf1);
			re2=new FileReader(inf2);
			int g;
			while((g = re.read())!=-1) {
				
			}
		} 
		 catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}

}
