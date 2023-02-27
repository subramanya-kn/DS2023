import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest2 {
	public static void main(String[] args) {	
		
		MyFileReader mfr1 = new MyFileReader("king.txt");
		MyFileReader mfr2 = new MyFileReader("queen.txt");
		MyFileReader mfr3 = new MyFileReader("prince.txt");
		
		mfr1.readFile();
		mfr2.readFile();
		mfr3.readFile();
		
		mfr1.closeFile();
		mfr2.closeFile();
		mfr3.closeFile();
		
		
		
	}
}

class MyFileReader {
	FileInputStream fin; //hasA
	public MyFileReader(String filename) {
		try { fin = new FileInputStream(filename);} 
		catch (FileNotFoundException e) {e.printStackTrace();}
	}	
	void readFile() {
		try {
			byte b= (byte) fin.read(); //reads the ASCII of the first letter and returns the integer	
			while(b!=-1) {
				System.out.print((char)b); // convert that byte into a char
				b = (byte) fin.read(); //second character onwards reading...
				Thread.sleep(3); // slow motion feel
			}			
		} catch (IOException e) {System.out.println("Handler2 :"+e);} 
		catch (InterruptedException e) {System.out.println("Handler3 :"+e);}
	}	
	void closeFile() {
		try {fin.close();} catch (IOException e) {e.printStackTrace();}
	}
}




