import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//java.lang <--- is a default pacakge available to all the java programs

public class VariousExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("Begin of main");
		
			
			int scores[]= {89,70,65,88,99};
			
			//try {
				FileInputStream fin = new FileInputStream("abc.txt");
		//	}
		//	catch(FileNotFoundException e) {
				
		//	}
			
			System.out.println("score      : "+Arrays.toString(scores));
			System.out.println("score[0]   : "+scores[0]);
			System.out.println("score[1]   : "+scores[1]);
			System.out.println("score[2]   : "+scores[2]);
			System.out.println("score[3]   : "+scores[3]);
			System.out.println("score[4]   : "+scores[4]);
			
			String str= "Dassault Systems, 7th Block, Jayanagar, Bangalore";
			
			System.out.println("str        : "+str);
			System.out.println("str cap    : "+str.toUpperCase());
			System.out.println("str low    : "+str.toLowerCase());
			System.out.println("str charAt : "+str.charAt(9));
			System.out.println("str substr : "+str.substring(9,15));
		
		System.out.println("End of main");
		
	}

}
