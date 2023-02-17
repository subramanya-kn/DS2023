
public class MultiLevelInheritanceTest {

	public static void main(String[] args) {
		
		System.out.println("begin main");
		
		Person p = new Person('F',"Smita",23);
		p.printPerson();
		//System.out.println("p : "+p);
		
		System.out.println("--------------");
		
		Student s = new Student('M',"Siddharth",20,101,"Bharathi VidyaPeeth","CS",95.50f,'A');
		//System.out.println("s : "+s);
		s.printStudent();
		
		System.out.println("--------------");
		
				
		Employee e = new Employee('M',"Shriharsha",21,102,"NIE","ME",94.5f,'A',5590,"Dassault Systems","Analyst",5000.0);
		//System.out.println("e : "+e);
		e.printEmployee();
		System.out.println("end main");
		
	}

}

class Person
{
	char gender;
	String name;
	int age;
	
	Person() {
		//super(); //where this would call???
		System.out.println("Person() ctor...");
	}

	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	
	void printPerson() {
		System.out.println("GENDER : "+gender);
		System.out.println("NAME   : "+name);
		System.out.println("AGE    : "+age);
		
	}
	
	
}
class Student extends Person
{
	int rollNumber;
	String collegeName;
	String stream;
	float totalMarks;
    char grade;
    
	Student() {
		//super(); //default line of every ctor
		System.out.println("Student() ctor...");
	}

	public Student(char gender, String name, int age, int rollNumber, String collegeName, String stream,
			float totalMarks, char grade) {
		super(gender, name, age);
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
	
	
	Employee() {
		//super();//invokes the nearest super ctor..
		System.out.println("Employee() ctor...");
	}


	public Employee(char gender, String name, int age, int rollNumber, String collegeName, String stream,
			float totalMarks, char grade, int employeeId, String companyName, String designation, double basicSalary) {
		super(gender, name, age, rollNumber, collegeName, stream, totalMarks, grade);
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
