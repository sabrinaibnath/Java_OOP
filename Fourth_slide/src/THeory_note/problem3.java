package THeory_note;
class booby{
	void show() {
		System.out.println("hi i am class b");
	}
}
class nas extends booby implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
		}
		super.show();
	}
}
public class problem3 {

	public static void main(String[] args) {
		nas v=new nas();
		Thread t=new Thread(v);
		t.start();
		

	}

}
