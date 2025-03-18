package THeory_note;
class chingu extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("from thread A:"+i);
		}
	}
}
class jagiya extends Thread{
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("from thread B:"+j);
		}
	}
}
public class Problem1 {

	public static void main(String[] args) {
		chingu c=new chingu();
		c.start();
		jagiya j=new jagiya();
		j.start();
	}

}
