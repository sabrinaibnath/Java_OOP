import java.applet.*;
import java.awt.*;
public class MyGridLayout extends Applet{

	public  void init() {
		int count=1;
		setLayout(new GridLayout(3,3));
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
			add(new Button(Integer.toString(count)));
			count++; 
		}
		}

	}

}
