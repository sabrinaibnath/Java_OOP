package Previous_Year22;

import java.util.Scanner;

public class Section2_Problem2 {

	public static void main(String[] args) {
		double Xpoint,Ypoint;
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter x point:");
		Xpoint=in.nextDouble();
		System.out.println("please enter y point:");
		Ypoint=in.nextDouble();
		
		if(Xpoint>0 && Ypoint>0) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" Quadrant 1"+".");
		}
		if(Xpoint<0 && Ypoint>0) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" Quadrant 2"+".");
		}
		if(Xpoint<0 && Ypoint<0) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" Quadrant 3"+".");
		}
		if(Xpoint>0 && Ypoint<0) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" Quadrant 4"+".");
		}
		if((Xpoint==0 && Ypoint<0) || (Xpoint==0 && Ypoint>0)) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" Y"+"-"+"axis"+".");
		}
		if((Xpoint<0 && Ypoint==0) || (Xpoint>0 && Xpoint==0)) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" X"+"-"+"axis"+".");
		}
		if(Xpoint==0 && Ypoint==0) {
			System.out.println("("+Xpoint+","+Ypoint+")"+" is in"+" the origin"+".");
		}
		in.close();
	}

}
