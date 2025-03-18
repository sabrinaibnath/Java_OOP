
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class C_Question_P4 {

	public static void main(String[] args) {
		File infile=new File("C:\\Users\\Acer\\eclipse-workspace\\Java_Lab_Final\\src\\C_Q_P4.txt");
		
		BufferedReader re=null;
		
		String line="";
		HashMap<String,Integer>mymap=new HashMap<>();
		
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split("-");
				
				mymap.put(arr[0],Integer.parseInt(arr[1]));
			}
			//System.out.println(mymap);
			
			Integer k=mymap.get("CSE211");
			for(Integer i:mymap.values()) {
				if(i>k) {
					k=i;
				}
			}
		for(Map.Entry<String, Integer>entry:mymap.entrySet()) {
			if(entry.getValue().equals(k)) {
				System.out.println(entry.getKey()+"-"+entry.getValue());
			}
		}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
