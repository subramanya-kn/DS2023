
public class ThreadTest {

	public static void main(String[] args) {
		Bike rider1 = new Bike("Honda Unicorn");
		Car car = new Car("\tBMW");
		Train train = new Train("\t\tRajdhani");
		Boat boat = new Boat("\t\t\tWorld Tour Shipping");
		Airplane plane = new Airplane("\t\t\t\tBritish Airways");
		
		rider1.start();
		car.start();
		train.start();
		boat.start();
		plane.start();
	
		
		
	}

}

//1. extends from java.lang.Thread class
//2. over-ride its run() function - and invoke the business logic which
	// u want to participate in threaded environment

//3. create the object of all these threads in the main method
//4. invoke the start() method of the java.lang.Thread class which will
   // invoke the run() method of these classes

class Bike extends Thread //1
{
	String str;
	
	Bike(String s) {
		str = s;
	}
	void ride() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running...."+i);
		}
	}
	public void run() { //2
		ride();
	}
}

class Car extends Thread //1
{
	String str;
	
	Car(String s) {
		str = s;
	}
	void drive() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running...."+i);
		}
	}
	public void run() { //2
		drive();
	}
}

class Train extends Thread //1
{
	String str;
	
	Train(String s) {
		str = s;
	}
	void railing() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is running..on the rail track......."+i);
		}
	}
	public void run() {//2
		railing();
	}
}

class Boat extends Thread //1
{
	String str;
	
	Boat(String s) {
		str = s;
	}
	void sailing() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is sailing..on the ocean ......."+i);
		}
	}
	public void run() { //2
		sailing();
	}
	
	
}

class Airplane extends Thread //1
{
	String str;
	
	Airplane(String s) {
		str = s;
	}
	void flying() {
		for(int i=1;i<=200;i++) {
			System.out.println(str+" is flying..in the sky track......."+i);
		}
	}
	
	public void run() { //2
		flying();
	}
}
