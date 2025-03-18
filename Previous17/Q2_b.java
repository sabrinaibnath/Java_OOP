package Previous17;
class no{
	int n;
	no(int y){
		n=y;
	}
}
public class Q2_b {
   static Object modifyobj(no o) {
	   return o.n+10;
   }
	public static void main(String[] args) {
        no on=new no(2);
      System.out.println( modifyobj(on));
       
	}

}
