
import java.io.*; 

public class fu{ 
public static void main(String[] args) { 
 File inFile = new File("num.txt"); 
 File outFile = new File("output.txt"); 
  
 FileReader ins = null; 
 FileWriter outs = null; 
 
 
 try{ 
  ins=new FileReader(inFile); 
  outs = new FileWriter(outFile); 
  
  int ch; 
  while((ch=ins.read()) !=-1){ 
	  if(Character.isDigit(ch)) {
		  int number=ch-'0';
		  if(number%2==0) {
   outs.write(ch); 
		  }
	  }
  } 
 } 
  
 catch(IOException e){ 
  System.out.println(e); 
  System.exit(-1); 
 } 
  
 finally{ 
  try{ 
   ins.close(); 
   outs.close(); 
  } 
  catch(IOException e){ 
   System.out.println(e); 
  } 
 } 
} 
} 
