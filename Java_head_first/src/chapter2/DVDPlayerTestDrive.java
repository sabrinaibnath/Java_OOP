package chapter2;
class DVDPlayer{
	boolean canRecord = false;
	
	void recordDVD() {
		
		System.out.println("DVD recording");
	}
}
public class DVDPlayerTestDrive {

	public static void main(String[] args) {
		DVDPlayer obj1 = new DVDPlayer();
		
		obj1.canRecord = true;
		
		//obj1.playDvD();
		
		if(obj1.canRecord == true) {
			obj1.recordDVD();
		}
		
		
		
	}

}
