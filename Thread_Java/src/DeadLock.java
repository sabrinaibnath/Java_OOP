
public class DeadLock {

	public static void main(String[] args) {
		final String resource1="Resource 1";
		final String resource2="Resource 2";
		
		Runnable task1=new Runnable() {

			@Override
	 		public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1:Locked "+resource1);
			try {
			    Thread.sleep(100);
			}
			catch(InterruptedException e) {
				
			}
			synchronized(resource2) {
				System.out.println("Thread 1:Locked "+resource2);
			}
		   }
		  } 
		};
		Runnable task2=new Runnable() {

			@Override
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2:Locked "+resource2);
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					
				}
				synchronized(resource1) {
					System.out.println("Thread 2:Locked "+resource1);
				}
				}
			}
			
		};
		Thread t1=new Thread(task1);
		Thread t2=new Thread(task2);
		t1.start();
		t2.start();

	}
}
