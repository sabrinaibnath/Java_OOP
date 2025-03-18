import java.io.*;
import java.util.*;

public class File_Problem {

	public static void main(String[] args) {
		File infile1=new File("C:/Users/Acer/eclipse-workspace/Java_Lab_Final/src/Old.txt");
		File infile2=new File("C:/Users/Acer/eclipse-workspace/Java_Lab_Final/src/Transition.txt");
		File infile3=new File("C:\\Users\\Acer\\eclipse-workspace\\Java_Lab_Final\\src\\Fuck.txt");
		File infile4=new File("C:/Users/Acer/eclipse-workspace/Java_Lab_Final/src/NewM.txt");
		
		BufferedReader oldm=null;
		BufferedReader trans=null;
		FileWriter newe=null;
		FileWriter loge=null;
		LinkedHashMap<Integer,Double>Ol=new LinkedHashMap<>();
		LinkedHashMap<Integer,Double>Nl=new LinkedHashMap<>();
		LinkedHashMap<Integer,Double>Ml=new LinkedHashMap<>();
		try {
			  oldm=new BufferedReader(new FileReader(infile1));
			  trans=new BufferedReader(new FileReader(infile2));
			  newe=new FileWriter(infile4);
			  loge=new FileWriter(infile3);
			  
			  String line="";
			  while((line=oldm.readLine())!=null) {
				  String[] arr=line.split(" ");
				  Integer k=Integer.parseInt(arr[0].trim());
				  Double v=Double.parseDouble(arr[1].trim());
				  Ol.put(k, v);
			  }
			  System.out.println(Ol);
			  
			  while((line=trans.readLine())!=null) {
				  String[] arr=line.split(" ");
				  Integer k=Integer.parseInt(arr[0].trim());
				  Double v=Double.parseDouble(arr[1].trim());
				  Nl.put(k, Nl.getOrDefault(k,0.0)+v);
			  }
			System.out.println(Nl);
			
			for(Map.Entry<Integer, Double>itr:Nl.entrySet()) {
				if(Ol.containsKey(itr.getKey())) {
					Integer k=itr.getKey();
					Double v=itr.getValue()+Ol.get(k);
					Ol.put(k,v);
					newe.write(k.toString()+" "+v.toString()+"\n");
				}
				else {
					Ml.put(itr.getKey(),itr.getValue());
					loge.write(itr.getKey().toString()+" "+itr.getValue().toString()+"\n");
				}
			}
			System.out.println(Ol);
			System.out.println(Ml);
			
			oldm.close();
			trans.close();
			newe.close();
			loge.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
