package THeory_note;
class Yo implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("thread A:"+i);
	}
	}
}
public class problem2 {

	public static void main(String[] args) {
		Yo j=new Yo();
		Thread n=new Thread(j);
		n.start();

	}

}
