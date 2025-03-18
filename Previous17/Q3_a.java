package Previous17;
class Bank{
	String name,code,location;
	Bank(){
		name=code=location="null";
	}
	Bank(String n, String c, String l){
		name=n;
		code=c;
		location=l;
	}
	Bank(String name,String code){
		this.name=name;
		this.code=code;
	}
	Bank(String g){
		code=g;
	}
	void show() {
		System.out.println(name+" "+code+" "+location);
	}
}
class Sabrina extends Bank{
	String amount;
	Sabrina(String c,String a){
		super(c);
		amount=a;
	}
	void show() {
		System.out.println(amount+" "+super.code);
	}
	
}
public class Q3_a {
	public static void main(String args[]) {
      Sabrina obj=new Sabrina("01","1MillionDollars");
      obj.show();
      Bank obj2=new Bank();
      obj2.show();
      Bank obj3=new Bank("Sabrina","01","chaw");
      obj3.show();
	}
      
}
