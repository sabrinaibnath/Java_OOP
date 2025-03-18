package chapter2;
class TapeDeck{
	boolean canRecord=false;
	void playTape(){
		System.out.println("tape playing");
	}
	void playRecord(){
		System.out.println("tape recording");
	}
}
public class TapeDeckTestDrive {

	public static void main(String[] args) {
	TapeDeck n=new TapeDeck();
	n.canRecord=true;
	n.playTape();
	if(n.canRecord == true) {
		n.playRecord();
	}

	}

}
