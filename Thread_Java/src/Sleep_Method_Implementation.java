class Mythread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(100);//pause the thread for 1 sec
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Sleep_Method_Implementation {

	public static void main(String[] args) {
		Mythread1 obj=new Mythread1();
		obj.start();

	}

}
