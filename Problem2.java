class EvenSemester extends Thread{
	
		@Override
		public void run() {
			//synchronized(this) {
			for(int i=1;i<=8;i++) {
				if(i%2==0) {
					System.out.println("Even Semester"+"-"+i);
				}
			}
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
//}
	
class OddSemester implements Runnable{

	@Override
	public void run() {
		//synchronized(this) {
		for(int i=1;i<=8;i++) {
			if(i%2!=0) {
				System.out.println("Odd Semester"+"-"+i);
			}
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	}
//}
public class Problem2 {

	public static void main(String[] args) {
		EvenSemester obj=new EvenSemester();
		obj.start();
		
		OddSemester obj2=new OddSemester();
		Thread t1=new Thread(obj2);
		t1.start();
		
		try {
			obj.join();
			t1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
