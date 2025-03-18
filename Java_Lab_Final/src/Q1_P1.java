import java.io.*;
import java.util.*;

public class Q1_P1 {

	public static void main(String[] args) {
		File infile=new File("C:\\Users\\Acer\\eclipse-workspace\\Java_Lab_Final\\src\\Noki.txt");
		
		BufferedReader re=null;
		
		String line="";
		Map<String,LinkedHashSet<String>>mymap=new LinkedHashMap<>();
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split("\t");
				
				String course=arr[0].trim();
				String[] stu=arr[1].split(",");
				
				mymap.putIfAbsent(arr[0].trim(), new LinkedHashSet<>());
				
				for(String word:stu) {
					mymap.get(course).add(word.trim());
				}
				
			}
			
			System.out.println(mymap);
			re.close();
			String n;
			Scanner in=new Scanner(System.in);
			n=in.nextLine();
			if(mymap.containsKey(n)) {
				System.out.println(mymap.get(n));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
