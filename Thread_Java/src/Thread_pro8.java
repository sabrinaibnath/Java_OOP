class Alana implements Runnable{
	String name;
	Thread t;
	Alana(String s){
		name=s;
		t=new Thread(this,name);
	}
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i+" "+name);
		}
		System.out.println("this is done"+name);
	}
}
public class Thread_pro8 {

	public static void main(String[] args) {
		Alana obj=new Alana("sabrina");
		Thread onj=new Thread(obj);
		onj.start();
		Alana obj2=new Alana("subha");
		Thread onj2=new Thread(obj2);
		onj2.start();
		Alana obj3=new Alana("pritha");
		Thread onj3=new Thread(obj3);
		onj3.start();
	}

}
