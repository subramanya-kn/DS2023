
public class ArrayTest {

	public static void main(String[] args) {
		
		int teamIndia[] = new int[11]; // reserve 11 integers 
		
		try
		{
			System.out.println("Adding values into array...");
			teamIndia[0]=89; //initialization of teamIndia - index wise
			teamIndia[1]=59;
			teamIndia[2]=67;
			teamIndia[3]=55;
			teamIndia[4]=62;
			teamIndia[5]=8;
			teamIndia[10]=20;
			
			//teamIndia[14]=29;
			
			System.out.println("Added all the values into array...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index : "+e.getMessage()); // ClassName + message 
		}
			
		
		int totalScore=0;
		
		for(int i=0; i<teamIndia.length; i++) {
			System.out.println("batsman : "+teamIndia[i]);
			totalScore = totalScore + teamIndia[i];
		}
		
		System.out.println("---for each ----");
		
		for (int i : teamIndia) {
			System.out.println("score : "+i);
		}
		
		System.out.println("Total Score : "+totalScore);
	}

}
