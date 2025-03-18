class Count{
	long  count=0;
	public synchronized void add(int i) {
		count=count+i;
	}
	
}
public class Thread_Q22_6a {

	public static void main(String[] args) {
		 
		Count obj=new Count();
		
		Thread t1=new Thread(new Runnable() {
			
			public void run() {
				for(int i=1;i<=20000;i++) {
				     obj.add(i);
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=20001;i<=40000;i++) {
					obj.add(i);
				}
			}
		});
		Thread t3=new Thread(new Runnable() {
			public void run() {
				for(int i=40001;i<=60000;i++) {
					obj.add(i);
				}
				
			}
		});
		Thread t4=new Thread(new Runnable() {
			
			public void run() {
				for(int i=60001;i<=80000;i++) {
					obj.add(i);
				}
				
			}
		});
		Thread t5=new Thread(new Runnable() {
			int sum=0;
			public void run() {
				for(int i=80001;i<=100000;i++) {
					obj.add(i);
				}
							}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}
		catch(InterruptedException e) {
			 e.printStackTrace();
		}
		
		System.out.println(obj.count);
		
	}

}
