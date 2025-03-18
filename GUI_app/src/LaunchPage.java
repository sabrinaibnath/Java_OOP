import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public  class LaunchPage implements ActionListener {
	JFrame frame=new JFrame();
	JButton button=new JButton("New Window");
    LaunchPage(){
    	button.setBounds(100, 100, 200, 40);
    	button.addActionListener(this);
    	
    	frame.add(button);
    	frame.setSize(420,420);
    	frame.setLayout(null);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			Window_java obj=new Window_java();
		}
		
	}
	
}
