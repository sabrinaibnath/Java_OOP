package Previous_Year22;

import java.io.*;
import java.util.*;

public class Section1_Problem1 {

	public static void main(String[] args) {
		File infile =new File("C:/Users/Acer/eclipse-workspace/Collection_frameWork/src/Previous_Year22/S1_Problem1.txt");
		
		BufferedReader re=null;
		
		String line;
		
		Map<String,LinkedHashSet<String>> mymap=new LinkedHashMap<>();
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split("\t");
				
				String course=arr[0].trim();
				String[] arr2=arr[1].split(",");
				
				mymap.putIfAbsent(course, new LinkedHashSet<>());
				for(String word:arr2) {
					mymap.get(course).add(word.trim());
				}
			}
			re.close();
			
			Scanner in=new Scanner(System.in);
			String fin=in.nextLine();
			
			if(mymap.containsKey(fin)) {
				System.out.println(mymap.get(fin));
			}
			else {
				System.out.println("O bhai, You have put the wrong input");
			}
			
			for(Map.Entry<String, LinkedHashSet<String>>entry:mymap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue().size());	
			}
			
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
