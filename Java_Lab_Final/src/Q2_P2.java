import java.util.Scanner;

public class Q2_P2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		double x,y;
		x=in.nextDouble();
		y=in.nextDouble();
		
		if(x>0.0 && y>00) {
			System.out.println("("+x+","+y+")"+" is in Quadrant 1");
		}
		else if(x<0.0 && y>0.0) {
			System.out.println("("+x+","+y+")"+" is in Quadrant 2");
		}
		else if(x<0.0 && y<0.0) {
			System.out.println("("+x+","+y+")"+" is in Quadrant 3");
		}
		else if(x>0.0 && y>0.0) {
			System.out.println("("+x+","+y+")"+" is in Quadrant 4");
		}
		else if((x>0.0 && y==0.0)||(x<0.0 && y==0.0)) {
			System.out.println("("+x+","+y+")"+" is in X"+"-axis");
		}
		else if((x==0.0 && y>0.0)||(x==0.0 && y<0)){
			System.out.println("("+x+","+y+")"+" is in Y"+"-axis");
		}
		else if(x==0.0 && y==0.0){
			System.out.println("("+x+","+y+")"+" is in origin");
		}
		in.close();
	}

}
