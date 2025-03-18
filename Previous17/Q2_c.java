package Previous17;

import java.io.*;
import java.util.*;

public class Q2_c {

	public static void main(String[] args) {
		File infile=new File("C://Users//Acer//eclipse-workspace//Previous_year22//src//Previous17//studentR.txt");
		BufferedReader re=null;
		LinkedHashMap<String,Integer>ma=new LinkedHashMap<>();
		String g,val;
		int k;
		try {
			re=new BufferedReader(new FileReader(infile));
			while((g=re.readLine())!=null) {
				String[] l=g.split(" ");
				val=l[0];
				k=Integer.parseInt(l[1]);
				ma.put(val, k);
			}
			System.out.println(ma);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
