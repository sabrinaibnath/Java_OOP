package Getting_name;

import java.text.SimpleDateFormat;
import java.util.*;

class Kid{
	String name;
	double h;
	GregorianCalendar bday;
	
	public Kid() {
		this.name="San";
		this.h=1;
		this.bday=new GregorianCalendar(1111,1,1);
	}
	public Kid(String n,double h1,String date) {
		StringTokenizer st=new StringTokenizer(date,"/");
		int year=Integer.parseInt(st.nextToken());
		int month=Integer.parseInt(st.nextToken());
		int day=Integer.parseInt(st.nextToken());
		name=n;
		h=h1;
		this.bday=new GregorianCalendar(year,month,day);
	}
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formattedBday = sdf.format(this.bday.getTime());
		return name+" "+h+" "+this.bday;
	}
	
}
public class To_String_Code {

	public static void main(String[] args) {
		Kid sabrina=new Kid("Sabrina",8.0,"2002/11/11");
		System.out.println(sabrina.toString());

	}

}
