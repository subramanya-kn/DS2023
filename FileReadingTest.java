import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {	
		
			try {
				System.out.println("Trying to open the file...");
				//c:\windows\mydata\yourfile.txt  c:\varun\abc.txt
				FileInputStream fin = new FileInputStream("/Users/apple/DS2023/CoreJavaNotes.txt");
				System.out.println("File is open...");

				byte b= (byte) fin.read(); //reads the ASCII of the first letter and returns the integer	
				while(b!=-1) {
					System.out.print((char)b); // convert that byte into a char
					b = (byte) fin.read(); //second character onwards reading...
					Thread.sleep(3); // slow motion feel
				}			
				System.out.println("Trying to close the File ...");	
				fin.close();System.out.println("File is closed...");
			} catch (FileNotFoundException e) {
				System.out.println("Handler1 :"+e);
			} catch (IOException e) {
				System.out.println("Handler2 :"+e);
			} catch (InterruptedException e) {
				System.out.println("Handler3 :"+e);
			}			
		
		
	}
}
