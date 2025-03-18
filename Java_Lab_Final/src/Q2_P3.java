import java.io.*;
import java.util.ArrayList;

public class Q2_P3 {

	public static void main(String[] args) {
	    File infile=new File("C:\\Users\\Acer\\eclipse-workspace\\Java_Lab_Final\\src\\Q2_P3.txt");
	    BufferedReader re=null;
	    
	    ArrayList<String>l1=new ArrayList<>();
	    ArrayList<String>l2=new ArrayList<>();
	    int Tp=0,Fp=0,Fn=0,Tn=0;
	    String line="";
	    try {
	    	re=new BufferedReader(new FileReader(infile));
	    	
	    	while((line=re.readLine())!=null) {
	    		String[] arr=line.split("\t");
	    		l1.add(arr[1]);
	    		l2.add(arr[2]);
	    	}
	    	for(int i=0;i<l1.size();i++) {
	    		if(l1.get(i).equals("Favor") && l2.get(i).equals("Favor")) {
	    			Tp++;
	    		}
	    		else if(l1.get(i).equals("Favor") && l2.get(i).equals("Against")) {
	    			Fp++;
	    		}
	    		else if(l1.get(i).equals("Against") && l2.get(i).equals("Favor")) {
	    			Fn++;
	    		}
	    		else if(l1.get(i).equals("Against") && l2.get(i).equals("Against")) {
	    			Tn++;
	    		}
	    	}
	    	System.out.println(Tp);
    		System.out.println(Fp);
    		System.out.println(Fn);
    		System.out.println(Tn);
    		
    		double lo=(double)Tp+Fn;
    		double lo1=(double)Tp+Fp;
    		
    		double R=(double)(Tp/lo);
    		
    		double P=(double)(Tp/lo1);
    		
    		double S=(double)((2*P*R)/(P+R));
    		
    		double u=(double)(Tp+Tn);
    		double Acc=(double)(u/(Tp+Tn+Fp+Fn));
    		
    		System.out.println(R);
    		System.out.println(P);
    		System.out.println(S);
    		System.out.println(Acc);
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
