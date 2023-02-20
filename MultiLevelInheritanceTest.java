import java.time.LocalDate;
/*
 * 
 * 
 * 					Person
 * 					| AadharCard aadharCard; //hasA
 * 					| PersonalityType 
 * 					| MedicalHistory
 * 					|
 * 		------------------
 * 			|
 * 		Student
 * 			|
 * 			|
 * 		Employee
 * 	
 * 
 * 
 * 
 */
public class MultiLevelInheritanceTest {

	public static void main(String[] args) {
		
		System.out.println("begin main");
	/*	
		ChessPlayer chessPlayer = new ChessPlayer();
		chessPlayer.brain.left.process();
		chessPlayer.brain.left.think();
		
		chessPlayer.brain.right.process();
		chessPlayer.brain.right.imagines();
		
		
		Doctor d = new Doctor();
		d.stetho.readPulse();
		
		Surgeon s = new Surgeon();
		s.stetho.readPulse();*/
		
		

		Person personObjRef2 = new Person("Mediator");
		personObjRef2.adharCard.setAadharCard("4234 4234 4234", "Punjab", LocalDate.of(1997, 2, 25), "Enthusiastic.jpg", "Garima", 'F',"8877667766");
		personObjRef2.medicalHistory.setBloodGroupAndEyeSight("A", "Normal");
		
		personObjRef2.adharCard.printAdhaarCardDetails();
		personObjRef2.medicalHistory.printBloodGroupAndEyeSight();
		//personObjRef2.medicalHistory.printMedicalHistory();
		personObjRef2.printPerson();

		System.out.println("=====================================");
		
		/*
		Person personObjRef1 = new Person("Architect");
		personObjRef1.adharCard.setAadharCard("1234 1234 1234", "Bangalore", LocalDate.of(1997, 2, 25), "Smiley.jpg", "Smita Saxena", 'F',"9820982055");
		personObjRef1.medicalHistory.setMedicalHistory("120/80", "140/160", "Normal", LocalDate.of(2022, 7, 20), "No Smoking", "No Alcohol", "B+", 160, 65);
		personObjRef1.adharCard.printAdhaarCardDetails();
		personObjRef1.medicalHistory.printMedicalHistory();
		personObjRef1.printPerson();

		System.out.println("=====================================");
		
		Student studentObjRef1 = new Student("Adventurer",'M',"Siddharth",20,101,"Bharathi VidyaPeeth","CS",95.50f,'A');
		
		studentObjRef1.adharCard.setAadharCard("5234 5234 6634", "Mumbai", LocalDate.of(1996, 4, 23), "Simple.jpg", "Siddhart", 'M',"8827782055");
		studentObjRef1.medicalHistory.setMedicalHistory("120/80", "120/140", "Sharp", LocalDate.of(2022, 5, 25), "No Smoking At all", "No Alcohol at all", "O", 165, 60);
		studentObjRef1.medicalHistory.printMedicalHistory();
		studentObjRef1.adharCard.printAdhaarCardDetails();
		studentObjRef1.printStudent();
*/
		
		//System.out.println("p : "+p);
		
		/*System.out.println("--------------");
		
		Student s = new Student('M',"Siddharth",20,101,"Bharathi VidyaPeeth","CS",95.50f,'A');
		//System.out.println("s : "+s);
		
		s.printStudent();
		
		System.out.println("--------------");
		
				
		Employee e = new Employee('M',"Shriharsha",21,102,"NIE","ME",94.5f,'A',5590,"Dassault Systems","Analyst",5000.0);
		//System.out.println("e : "+e);
		e.printEmployee();
		System.out.println("end main");
		*/
	}

}

class Heart
{
	
}
class Lung
{
	
}
class Kidney
{
	
}
class Hemisphere
{
	void process() {
		System.out.println("processing...");
	}
}
class LeftHemisphere extends Hemisphere
{
	void think() {
		System.out.println("analyzing....");
	}
	
}
class RightHemisphere extends Hemisphere
{
	void imagines() {
		System.out.println("imagining....");
	}
	
}
class Brain
{
	LeftHemisphere left = new LeftHemisphere(); //hasA
	RightHemisphere right = new RightHemisphere(); //hasA
	
	
}

//Car has Wheels, Bulb has Filament, 

class Human 
{
	Heart heart = new Heart(); //hasA  ob1
	
	Brain brain = new Brain();		//obj2
	
	Lung lung1 =new Lung();			//obj3
	Lung lung2 = new Lung();		//obj4
	
	Kidney kidney1 = new Kidney();  //obj5
	Kidney kidney2 = new Kidney(); //obj6
	
	
	
	
}

class AadharCard
{
	String aadharNumber;
	String address;
	LocalDate birthdate;
	String photograph;
	String nameOnAdhaar;
	char gender;
	String phoneNumber;
	
	void setAadharCard(String aadharNumber, String address, LocalDate birthdate, String photograph, String nameOnAdhaar,
			char gender, String phoneNumber) {
		
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.birthdate = birthdate;
		this.photograph = photograph;
		this.nameOnAdhaar = nameOnAdhaar;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCardDetails() {
		System.out.println(" --- AADHAAR DETAILS ---");
		System.out.println("Adhaar Number    : "+aadharNumber);
		System.out.println("Adhaar Address   : "+address);
		System.out.println("Adhaar birthdate : "+birthdate);
		System.out.println("Adhaar Photo     : "+photograph);
		System.out.println("Adhaar Name      : "+nameOnAdhaar);
		System.out.println("Adhaar gender    : "+gender);
		System.out.println("Adhaar Phone     : "+phoneNumber);
		System.out.println("-------------------------");
	}
}

class MedicalHistory
{
	String bloodPressure; //130/90
	String sugarLevel; //both fasting /pp  140/160
	String eyeSight;
	LocalDate lastDateDiagnosed;
	String smokingHistory;
	String alcoholHistory;
	String bloodGroup;
	int height;
	int weight;
	
	
	
	public void setBloodGroupAndEyeSight(String eyeSight, String bloodGroup) {
		
		this.eyeSight = eyeSight;
		this.bloodGroup = bloodGroup;
	}

	public void setMedicalHistory(String bloodPressure, String sugarLevel, String eyeSight, LocalDate lastDateDiagnosed,
			String smokingHistory, String alcoholHistory, String bloodGroup, int height, int weight) {
		this.bloodPressure = bloodPressure;
		this.sugarLevel = sugarLevel;
		this.eyeSight = eyeSight;
		this.lastDateDiagnosed = lastDateDiagnosed;
		this.smokingHistory = smokingHistory;
		this.alcoholHistory = alcoholHistory;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
	}

	void printBloodGroupAndEyeSight() {
		System.out.println("----Medical History -----");
		System.out.println("Eye Sight      : "+eyeSight);
		System.out.println("Blood Group    : "+bloodGroup);
		System.out.println("---------------");
	}
	void printMedicalHistory() {
		System.out.println("----Medical History -----");
		System.out.println("Blood Pressure : "+bloodPressure);
		System.out.println("Sugar Levels   : "+sugarLevel);
		System.out.println("Eye Sight      : "+eyeSight);
		System.out.println("Last Diagnosed : "+lastDateDiagnosed);
		System.out.println("Smoking history: "+smokingHistory);
		System.out.println("Alcohol history: "+alcoholHistory);
		System.out.println("Blood Group    : "+bloodGroup);
		System.out.println("Height         : "+height);
		System.out.println("Weight         : "+weight);
		System.out.println("---------------");
	}
	/*@Override
	public String toString() {
		return "MedicalHistory [bloodPressure=" + bloodPressure + ", sugarLevel=" + sugarLevel + ", eyeSight="
				+ eyeSight + ", lastDateDiagnosed=" + lastDateDiagnosed + ", smokingHistory=" + smokingHistory
				+ ", alcoholHistory=" + alcoholHistory + ", bloodGroup=" + bloodGroup + ", height=" + height
				+ ", weight=" + weight + "]";
	}*/
	
	

}

class Person extends Human
{
	//char gender; //hasA - essential part of the enclosing object/class
	//String name;
	//int age;
	AadharCard adharCard = new AadharCard(); //User defined type UDT
	String personalityType;
	MedicalHistory medicalHistory = new MedicalHistory();
	
	
	
	Person(String personalityType) {
		//super(); //where this would call???
		System.out.println("Person(String) ctor...");
		this.personalityType = personalityType;
	}

	void printPerson() {
		System.out.println("Personality : "+personalityType);
	}
}
/*
class ChessPlayer extends Person
{
	void playingChess() {
		brain.left.think();
		brain.right.imagines();
	}
}*/

class Student extends Person
{
	int rollNumber;
	String collegeName;
	String stream;
	float totalMarks;
    char grade;
    
	

	public Student(String personalityType, char gender, String name, int age, int rollNumber, String collegeName, String stream,
			float totalMarks, char grade) {
		//super(gender, name, age);
		super(personalityType);
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.stream = stream;
		this.totalMarks = totalMarks;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", rollNumber=" + rollNumber + ", collegeName=" + collegeName
				+ ", stream=" + stream + ", totalMarks=" + totalMarks + ", grade=" + grade + "]";
	}
	
	void printStudent() {
		super.printPerson();
		System.out.println("ROLLNO : "+rollNumber);
		System.out.println("COLLEGE: "+collegeName);
		System.out.println("STREAM : "+stream);
		System.out.println("TOTAL  : "+totalMarks);
		System.out.println("GRADE  : "+grade);
	}
	
}
class Employee extends Student
{
	int employeeId;
	String companyName;
	String designation;
	double basicSalary;
	
	



	public Employee(String persType , char gender, String name, int age, int rollNumber, String collegeName, String stream,
			float totalMarks, char grade, int employeeId, String companyName, String designation, double basicSalary) {
		super(persType,gender, name, age, rollNumber, collegeName, stream, totalMarks, grade);
		this.employeeId = employeeId;
		this.companyName = companyName;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}


	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", employeeId=" + employeeId + ", companyName="
				+ companyName + ", designation=" + designation + ", basicSalary=" + basicSalary + "]";
	}
	
	void printEmployee() {
		super.printStudent();
		System.out.println("EMPNO  : "+rollNumber);
		System.out.println("COMAPNY: "+collegeName);
		System.out.println("DESG   : "+stream);
		System.out.println("BASIC  : "+totalMarks);
	}
	
	
}













class A
{
	//there is "default constructor"/"implicit no-arg ctor",
	//default ctor is invisible
	// it does NOTHING
}

class B 
{
	B() { //it is visible to our EYES, that means it is not
			//a default ctor
		//	explicit no-arg ctor
		
	}
}


class Doctor
{
	Stethoscope stetho = new Stethoscope();
	
}
class Surgeon extends Doctor //isA
{
	
}
/*
class Patient extends Person
{
	
}
class HeartPatient extends Patient
{
	
}
*/

/*
 * 
 * 						   Scope
 * 							| void probe(){}
 * 				-----------------------------
 * 				|			|			|
 * 			Stethoscope	MicroScope	TeleScope
 * 			readPulse()		|zoom(){}	 |zoomInMacro(){}
 * 					ElectronMicroScope	ElectronTelescope
 * 
 */
class Scope
{
	
}
class Stethoscope extends Scope
{
	void readPulse() {
		System.out.println("reading the pulse...");
	}
}
class MicroScope extends Scope
{
	void zoomIn() {
		System.out.println("zoom in into the micro world...");
	}
}
class TeleScope extends Scope
{
	
}

/*class Scope extends Telescope
{
	
}

class P extends Q
{
	
}
class Q extends P
{
	
}*/



class Shop
{
	
}

class PanShop extends Shop
{
	
}
class ShoeShop extends Shop
{
	
}

class Mall extends Shop
{
	
}
class ShoppingMall extends Mall
{
	
}


class Item
{
	
}
class ShoppingItem extends Item
{
	
}



class AnyClass
{
	int anyData1; //FIELD area
	int anyData2; 
	int anyData3;
	
	
	//METHOD AREA
	AnyClass() {
		
	}
	void anyfunction()
	{
		
	}
	void otherFunction() {
		
	}
	void someFunction() {
		
	}
}


class Parent
{
	int i; //hasA
	int x;
	
	Parent(int i) {
		this.i=i;
	}
	Parent(int i, int x) {
		this.i=i;
		this.x=x;
	}
}
class Child extends Parent //isA
{
	int j; //hasA
	
	Child(int i, int j) {
		super(i);
		this.j=j;
	}
}







