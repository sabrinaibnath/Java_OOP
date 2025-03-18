package Polymorphism_Java;
class kim{
	int i,j;
	kim(int a,int b){
		i=a;
		j=b;
	}
	void show() {
		System.out.println(i+j);
	}
}
class kardesian extends kim{
	int k;
	kardesian(int d,int f, int h){
		super(d,f);
		k=h;
	}
	void show() {
		super.show();
		System.out.println("k="+k);
	}
}
public class Method_Overriding_java {

	public static void main(String[] args) {
		kardesian obj=new kardesian(1,2,3);
		obj.show();

	}

}
