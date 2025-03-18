import javax.imageio.IIOException;

class Counter{
	int count;
	public synchronized void counter() {
		count++;
	}
}
public class Synchronization_Java {

	public static void main(String[] args) {
		Counter oj=new Counter();
		
		Thread t1=new Thread(new Runnable() {
			  public void run() {
				  for(int i=0;i<1000;i++) {
				  oj.counter();
			  }
			}
			
		});
		
		Thread t2=new Thread(new Runnable() {
			  public void run() {
				  for(int i=0;i<1000;i++) {
				  oj.counter();
			  }
			}
			
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(oj.count);
	}

}
