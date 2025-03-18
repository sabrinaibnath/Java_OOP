import java.awt.*;
import java.applet.*;
public class MyBorderLayout extends Applet {

	public void init() {
		setLayout(new BorderLayout());
		add(new Button("north"),BorderLayout.NORTH);
		add(new Button("center"),BorderLayout.CENTER);
		add(new Button("east"),BorderLayout.EAST);
		add(new Button("south"),BorderLayout.SOUTH);
		add(new Button("west"),BorderLayout.WEST);
	}

}
