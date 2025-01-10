package Previous_Year22;

import java.io.*;
import java.util.*;


public class Section2_Probelm1 {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Collection_frameWork/src/Previous_Year22/P1_PLayer.txt");
		
		BufferedReader re=null;
		FileWriter we=null;
		
		String word="";
	
		
		HashMap<String,String>mymap=new HashMap<>();
		
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((word=re.readLine())!=null) {
			  String[] part=word.split("\t");
			  
			  String name=part[0].trim();
			  String salary=part[1].trim();
			  
			  if(salary==null || salary.isEmpty()) {
				  salary="Null";
			  }
			  
			  mymap.put(name, salary);
			}			
			Integer newValue=50000+Integer.parseInt(mymap.get("Player A"));
			
			mymap.put("Player A", newValue.toString());
			
			re.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			we=new FileWriter(infile);
			
			for(Map.Entry<String, String> entry:mymap.entrySet()) {
				we.write(entry.getKey()+"\t"+entry.getValue()+"\n");
			}
			we.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
