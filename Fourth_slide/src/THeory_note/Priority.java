package THeory_note;
class bog implements Runnable{
	public void run() {
		System.out.println("love yaa");
	}
}
class boggy implements Runnable{
	public void run() {
		System.out.println("hate yaa");
	}
}
public class Priority {

	public static void main(String[] args) {
	bog b=new bog();
	boggy bok=new boggy();
	Thread t=new Thread(b);
	t.setPriority(Thread.MAX_PRIORITY);
	Thread bonni=new Thread(bok);
	bonni.setPriority(Thread.MIN_PRIORITY);
	t.start();
	bonni.start();
	}

}
