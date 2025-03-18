class Bo{
	void show() {
		System.out.println("From B");
	}
}
class Ao extends Bo implements Runnable{
	
	@Override
	public void run() {
		System.out.println("from b");
		super.show();
	}
	
}
public class Thread_Extends_B {

	public static void main(String[] args) {
		Ao obj=new Ao();
		Thread n=new Thread(obj);
		n.start();
	

	}

}
