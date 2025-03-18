class dumb implements Runnable{
	String name;
	Thread t;
	dumb(String n){
		name=n;
		t=new Thread(this,name);
		t.start();
	}
	public void run() {
		System.out.println(name+" is running");
	}
}
public class ThreeThread_In_Main_function {

	public static void main(String[] args) {
		dumb obj1=new dumb("yuck");
		dumb obj2=new dumb("yuck");
		dumb obj3=new dumb("yuck");
	}

}
