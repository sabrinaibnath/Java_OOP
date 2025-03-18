package Previous17;

public class Q1_b {
    int quo=1;
    Q1_b(int n){
    	quo=n;
    }
    public void show() {
    	System.out.println("this is"+quo);
    }
	public static void main(String[] args) {
		System.out.println("oop");
		Q1_b obj=new Q1_b(4);
		obj.show();

	}

}
