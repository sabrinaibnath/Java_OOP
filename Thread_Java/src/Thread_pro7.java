class Boo{
	void show() {
		System.out.println("hi");
	}
}
class Ai extends Boo implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("this is Ai"+i);
		}
		super.show();
	}
}
public class Thread_pro7 {

	public static void main(String[] args) {
	Ai obj=new Ai();
	Thread onj1=new Thread(obj);
	onj1.start();

	}

}
