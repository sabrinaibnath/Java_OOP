package Previous_Year22;

import java.io.*;
import java.util.ArrayList;

public class Section1_Probelm3 {

	public static void main(String[] args) {
		File infile=new File("C:/Users/Acer/eclipse-workspace/Collection_frameWork/src/Previous_Year22/S1_Probelm3.txt");
		
		BufferedReader re=null;
		String line="";
		
		ArrayList<String>l1=new ArrayList<>();
		ArrayList<String>l2=new ArrayList<>();
		
		int FF=0,FA=0,AF=0,AA=0;
		try {
			re=new BufferedReader(new FileReader(infile));
			
			while((line=re.readLine())!=null) {
				String[] arr=line.split("\t");
				
				l1.add(arr[1]);
				l2.add(arr[2]);
			}
			
			for(int i=0;i<l1.size();i++) {
				if(l1.get(i).equals("Favor") && l2.get(i).equals("Favor")) {
					FF++;
				}
				if(l1.get(i).equals("Favor") && l2.get(i).equals("Against")) {
					FA++;
				}
				if(l1.get(i).equals("Against") && l2.get(i).equals("Favor")) {
					AF++;
				}
				if(l1.get(i).equals("Against") && l2.get(i).equals("Against")) {
					AA++;
				}
			}
			re.close();
			System.out.println(FF+" "+FA+" "+AF+" "+AA);
			double total=(double)(FF+FA+AF+AA);
			
			double P0=(double)(FF+AA)/total;
			double Pf=((double)(FF+FA)/total) * ((double)(FF+AF)/total);
			double Pa=((double)(AF+AA)/total) * ((double)(FA+AA)/total);
			double Pe=Pf+Pa;
			System.out.println(P0+" "+Pf+" "+Pa+" "+Pe);
			
			double Kappa=(P0-Pe)/(1-Pe);
			System.out.println(Kappa);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
