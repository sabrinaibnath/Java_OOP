package Previous_Year22;

import java.io.*;
import java.util.*;

public class Section2_Problem3 {

	public static void main(String[] args) {
	    
		File infile=new File("C:/Users/Acer/eclipse-workspace/Collection_frameWork/src/Previous_Year22/S2_Problem3.txt");
		BufferedReader re=null;
		ArrayList<String>l1=new ArrayList<>();
		ArrayList<String>l2=new ArrayList<>();
		int TP=0,FP=0,FN=0,TN=0;
		try {
			re=new BufferedReader(new FileReader(infile));
			
			String line;
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split("\t");
				
				l1.add(arr[1]);
				l2.add(arr[2]);
			}
			//System.out.println(l1);
			//System.out.println(l2);
			re.close();
			
			for(int i=0;i<l1.size();i++) {
				if((l1.get(i).equals("Favor")) && (l2.get(i).equals("Favor"))) {
				   TP++;	
				}
				if((l1.get(i).equals("Favor")) && (l2.get(i).equals("Against"))) {
					   FP++;	
					}
				if((l1.get(i).equals("Against")) && (l2.get(i).equals("Favor"))) {
					   FN++;	
					}
				if((l1.get(i).equals("Against")) && (l2.get(i).equals("Against"))) {
					   TN++;	
					}
			}
			
			
			double R=(double)TP/(double)(TP+FN);
			double p=(double)TP/(double)(TP+FP);
			double s=(double)(2*p*R)/(double)(p+R);
			double acc=(double)(TP+TN)/(TP+FP+FN+TN);
			
			System.out.println(R);
			System.out.println(p);
			System.out.println(s);
			System.out.println(acc);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
