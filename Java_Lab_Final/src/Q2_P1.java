import java.io.*;
import java.util.*;

public class Q2_P1 {

	public static void main(String[] args) {
		File infile=new File("C:\\Users\\Acer\\eclipse-workspace\\Java_Lab_Final\\src\\P2_Q1.txt");
		
		BufferedReader re=null;
		FileWriter we=null;
		
		HashMap<String,String>Ol=new HashMap<>();
		
		String line="";
		
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split("\t");
				String name=arr[0].trim();
				String Salary=arr[1].trim();
				if(Salary==null || Salary.isEmpty()) {
					Salary="Null";
				}
				
				Ol.put(name, Salary);
			}
			Integer j=Integer.parseInt(Ol.get("Player A"));
			Integer nv=50000+j;
			Ol.put("Player A", nv.toString());
			System.out.println(Ol);
			re.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try{
			we=new FileWriter(infile);
			for(Map.Entry<String, String>entry:Ol.entrySet()) {
				we.write(entry.getKey()+"\t"+entry.getValue()+"\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				we.close();	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
