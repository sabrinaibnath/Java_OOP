package Getting_name;

import java.util.StringJoiner;

class S1{
	int n;
	String na;
	S1(int i,String h){
		n=i;
		na=h;
	} 

	public String toString() {
		
		return new StringJoiner("|",S1.class.getName()+"[","]").add("Name:"+na).add("id"+n).toString();
		}
}
public class Another {
	public static void main(String[] args) {
				S1 sab=new S1(23,"Sabrina");
				System.out.println(sab.toString());
				

			}

		
	}

