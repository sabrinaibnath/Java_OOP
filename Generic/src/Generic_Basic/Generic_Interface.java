package Generic_Basic;
interface MyGen<Thing>{
	public Thing getValue();
}
class MyGclass<Thing> implements MyGen{
    Thing k;
    MyGclass(Thing h){
    	k=h;
    }
	@Override
	public Thing getValue() {
		return k;
	}
	
}
public class Generic_Interface {

	public static void main(String[] args) {
	  MyGclass obj=new MyGclass(1);
	  System.out.println(obj.getValue());
	}

}
