import java.io.IOException;

@SuppressWarnings("unused")
class Counter{
	int count;
	public synchronized void count() {
		count++;
	}
}
public class Synchro_exam {

	public static void main(String[] args)  {
		Counter obj=new Counter();
		Thread t1=new Thread(new Runnable()
				{
			public void run() {
				for(int i=0;i<100;i++) {
					obj.count();
				}
			}
				});
	Thread t2=new Thread(new Runnable()
		{
	public void run() {
		for(int i=0;i<100;i++) {
			obj.count();
		}
	}
		});
	t1.start();
	t2.start();
	try {
	t1.join();
	t2.join();
	}
	 catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println(obj.count);
	}

}
