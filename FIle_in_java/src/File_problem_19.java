import java.io.*;

public class File_problem_19 {

	public static void main(String[] args) {
		RandomAccessFile inf=null;
		
		try {
			inf=new RandomAccessFile("data.txt","rw");
			inf.writeChar('X');
			inf.writeInt(100);
			inf.writeDouble(500.00);
			inf.seek(2);
			System.out.println(inf.readInt());
			
			System.out.println(inf.readChar());
			
			System.out.println(inf.readDouble());
			
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
