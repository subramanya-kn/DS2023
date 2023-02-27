import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("new.txt", true);
			System.out.println("File is ready for writing...");
			
			String str = "this is a SECOND new line now";
			byte barry[] = str.getBytes();
			System.out.println("String is converted into byte array...");
			
			fout.write(barry); //it takes byte as an array
			System.out.println("array is written to the file...");
			
			System.out.println("Closing the file...");
			fout.close();
			System.out.println("file is closed...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
