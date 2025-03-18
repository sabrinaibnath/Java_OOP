import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window_java {
	JFrame frame=new JFrame();
	JLabel label=new JLabel("Hello!");
	
	Window_java(){
		label.setBounds(0, 0, 100, 50);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 420, 420);
		frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);
		
	}

}
