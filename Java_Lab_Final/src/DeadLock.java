
public class DeadLock {

	public static void main(String[] args) {
		final String re1="Re 1";
		final String re2="Re 2";
		
		Runnable ru1=new Runnable() {

			@Override
			public void run() {
			synchronized(re1) {
				System.out.println(re1);
				
				try {
					Thread.sleep(1000);
				}
				catch(Exception e ) {
					e.printStackTrace();
				}
				
				synchronized (re2) {
					System.out.println(re2);
				}
			}
				
			}
			
		};
		

		Runnable ru2=new Runnable() {

			@Override
			public void run() {
			synchronized(re2) {
				System.out.println(re2);
				
				try {
					Thread.sleep(1000);
				}
				catch(Exception e ) {
					e.printStackTrace();
				}
				
				synchronized (re1) {
					System.out.println(re1);
				}
			}
				
			}
			
		};
		
		Thread t1=new Thread(ru1);
		Thread t2=new Thread(ru2);
		
		t1.start();
		t2.start();

	}

}
