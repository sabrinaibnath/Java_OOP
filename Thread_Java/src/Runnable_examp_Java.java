class Pookie implements Runnable{
      public void run() {
    	  for(int i=1;i<5;i++) {
    		  System.out.println(i);
    	  }
    	  System.out.println("pookie is done");
	}
	
}
class Cutie implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
		System.out.println(i);
	}
		System.out.println("cutie is done");
	}
}
public class Runnable_examp_Java {

	public static void main(String[] args) {
		Pookie obj=new Pookie();
		Thread obj1=new Thread(obj);
		obj1.start();
		Cutie obj2=new Cutie();
		Thread obj4=new Thread(obj2);
		obj4.start();

	}

}
