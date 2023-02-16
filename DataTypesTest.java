import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataTypesTest {

	public static void main(String[] args) {
		
		byte   rollNumber =127; // -128 ..... 0 ...... 127
		short  universityRollNumber=16590;
		int    internationalUniversityRollNumber=39850;
		long   galacticRollNumber=9999999999L;
		
		System.out.println("My roll number is                           : "+rollNumber);
		System.out.println("My university roll number is                : "+universityRollNumber);
		System.out.println("My international university roll  number is : "+internationalUniversityRollNumber);
		System.out.println("My galactic roll number is                  : "+galacticRollNumber);
		
		
		float interestRate = 8.45656F;
		double molecularDistance = 10.00009f;
		System.out.println("interest rate is    : "+interestRate);
		System.out.println("molecular distance  : "+molecularDistance);
		
						 // A           Z    a           z
		char gender=65; // 65 66 67....90   97         122
		System.out.println("gender is : "+gender);
		
		boolean areYouCertified=false;
		System.out.println("Are you certified ? "+areYouCertified);
	
		String myName="Vishhal";
		String myFatherName="Prabhakar";
		String mySurname="Dawane";
		
		System.out.println("My First    name : "+myName);
		System.out.println("My Father's name : "+myFatherName);
		System.out.println("My Surname  name : "+mySurname);
		
		LocalDate today1 = LocalDate.now();
		System.out.println("Today is : "+today1);
		
		LocalDateTime today2 = LocalDateTime.now();
		System.out.println("Today is : "+today2);

	}

}
/*

			data has various types
						|
		-----------------------------------------------------------------
		|			|			|			|						|
	Integral	floating		character	Boolean					|
		|		  float  4		char 2 		boolean 1 true/false	String
		|         double 8
		|
		byte	1 = 8 bits = 1 bit =  0 
		short	2					  1
		int		4
		long	8	
		
		
		1	 bit		0	(2)
						1
						
		2  bits			0 0    0 (4)
						0 1    1
						1 0	   2 	
						1 1    3
						
		3 bits		  0 0 0    0 (8)
					  0 0 1	   1	
					  0 1 0    2
					  0 1 1    3
					  1 0 0    4
					  1 0 1    5
					  1 1 0    6
					  1 1 1    7
					  
	    4 bits					(16)
	    5 bits					(32)
	    6 bits					(64)
	    7 bits					(128)
		8 bits					(256) <--- byte (1)
		9						  512
		10						1024
		11						2048
		12						4096
		13						8192
		14						16384
		15						32768 <-- short (2)
		16						...
					  
					  
					  
					  
					  
					  
					  
					  
			
			100 30 
			56
			
			576.90
			
			'Y' 'N' 
			"Yes" "No" "New York"

			true false

*/