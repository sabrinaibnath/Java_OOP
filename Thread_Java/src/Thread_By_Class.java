class Bitch extends Thread{

	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("Bitch is done");
	}
}
class Sassy extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("Sassy is done");
	}
}
public class Thread_By_Class {

	public static void main(String[] args) {
	new Bitch().start();
	new Sassy().start();

	}

}
