package JFRAME_Basic;

import javax.swing.JFrame;

 class Mythis extends JFrame{
	 Mythis(){
		 this.setVisible(true);//create a this
			this.setTitle("HI");//sets title of this
			this.setSize(420, 420);//set the size
			this.setResizable(false);//prevent this from resized
	 }
	
}
public class Jframe_Basic_Another_way {

	public static void main(String[] args) {
		Mythis obj=new Mythis();
		}

}
