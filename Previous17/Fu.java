package Previous17;

import java.io.*;
import java.util.*;

public class Fu {
	static LinkedHashMap<String,String>ma=new LinkedHashMap<>();
	public static void main(String[] args) {
		
        try {
        	File infile =new File("C:/Users/Acer/eclipse-workspace/Previous_year22/src/Previous17/studentR.txt");
        	BufferedReader re=null;
        	
        	String g;
        	re=new BufferedReader(new FileReader(infile));
        	while((g=re.readLine())!=null) {
        		String[] val=g.split(" ");
        		ma.put(val[0], val[1]);
        	}
        	System.out.println(ma);
        	String Id;
        	Scanner in=new Scanner(System.in);
        	Id=in.nextLine();
        	Mat(Id);
        	String num;
        	num=in.nextLine();
        	Hu(num);
        	
        }
        catch(Exception e){
        	System.out.println(e);
        }
	}
	public static void Mat(String Id1) {
		System.out.println(ma.get(Id1));
	}
	public static void Hu(String mark) {
		for(Map.Entry<String, String>entry:ma.entrySet()) {
			if(entry.getValue().equals(mark)) {
				System.out.println(entry.getKey());
			}
		}
	}

}
