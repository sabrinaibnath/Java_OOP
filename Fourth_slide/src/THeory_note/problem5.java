package THeory_note;

class desi implements Runnable{    
String name; 
Thread t;  
desi(String threadname){ 
 name=threadname; 
 t=new Thread(this, name); 
 t.start(); 
} 
 
public void run(){                     
 for (int i=1;i<=10;i++){ 
  System.out.println(name+": "+i); 
 } 
 System.out.println("End of "+name); 
} 
} 
public class problem5 {
	public static void main(String[] args){  
		 
		  new desi("A1"); 
		  new desi("A2"); 
		  new desi("A3"); 
		 
		      System.out.println("End of main Thread"); 
		 } 
	

}
