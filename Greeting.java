
public class Greeting {
	public static void main(String[] args) {	
		System.out.println("Hello Java How Are You?");
		System.out.println("1. Java WORA");
		System.out.println("2. Java is Simple");
		System.out.println("   no pointers, no memory management");
		System.out.println("   no need to know h/w details");
		System.out.println("3. Java is object oriented, OOPS");
		
		Joker j = new Joker();//object 
		j.gigling();
		j.makingJoke();
		j.makingJoke();
		j.uniCycling();
		
		Joker j2 = new Joker();
		j2.gigling();
		j2.gigling();
		j2.gigling();
	}

}
class Joker
{
	void gigling() {
		System.out.println("Joker is gigling...");
	}
	void uniCycling() {
		System.out.println("Joker is unicyling...");
	}
	void makingJoke() {
		System.out.println("Joker is joking...");
	}
}

class Elephant
{
	void swimming() {
		System.out.println("Elephant is swimming...");
	}
}
class RingMaster
{
	void instruct() {
		System.out.println("Ring master is instructing....");
	}
}
class Gift
{
	void accept() {
		System.out.println("acceping the gift...");
	}
	void reject() {
		System.out.println("Never reject it...");
	}
	void forward() {
		System.out.println("Forwarding the gift....");
	}
}
/*
 
 Bottle:
capacity, color, weight, brand, waterLevel

fill(){}
isEmpty(){}
getWaterLevel(){}
getBrand(){}
clean(){}

tree :- 
roots , trunk , flower , fruit , leaves ,branch , taproot , twig

TV - size, color, brand, type of display


 InsurancePolicy
 
 insurance : 
 insurance_company, 
 insurance_company_id, 
 customerid, 
 customerName,
 insuranceAmount, 
 insuranceDuration,
 insuranceEmi, 
 godIsNoWhere
 godIsNowHere
 god_is_now_here

 updateInsuranceDuration(),
 changeEmi(),
 payemi(),
 updateCustomerName(),
 printReceipt()
 
 
 Air Conditioner:

1.Size
2.color
3.capacity
4. temperature
+
1.increase_temp()
2.Decrease_temp()
3.swing()
4.increase_speed()

laptop = colour, size, camera, Ram, Rom, brand
Harddisk, graphics
putOnSleep(){}
start(){}
shutDown(){}
restart(){}
connectCharger(){}


Vehicle = Color, no_of_wheels, brand, engine_power, mileage, price
 vehicle= find_mileage(), turn_on_off(), etc..
 
 Blood Bank	
 	- bloodCollectCount
 	  patientName
 	  bloodgroup
 	  volumeRequired
 	  disease
 	  donorName
 	  donorHistoryOfDiseases
 	  donorContact
 	  patientContact
 	  donorBloodGroup
 	  volunteersIfAny
 	  		donateBlood(){}
 	  		seperate(){}
 	  		collect(){}
 	  		store(){}
 	  		certify(){}
 	  		matchTheBlood(){}

	Lion
		color, breed, color, age, height
			walk(){}
			roar(){}
			eat(){}
			hunt(){}
			sleep(){}
			
	Car
		color,size,speed,fuelType, gear, direction
		fuelQty
		changeSpeed()
		addFuel(){}
		accelerate(){}
		applyBrake(){}
		changeDirection(){}
		takeReverse(){}
		changeGear(){}
	
	Animate
		characters
		main, brother, sister, villain
		
		changeVoice(){}
		physicalAppearance(){}
		walk(){}
		
	Mouse
		size,button,wired,color,brand,
			leftClick(){}
			rightClick(){}
			drag(){}
			moving(){}
			selection(){}
			scroll(){}
	
	DrivingLicense
		id, name,age,typeofvehicle, issuedate, expiry
		authorizedToDriveOrNot(){}
		gettingIdentity(){}
		idProof(){}
		
	ShoppingWebsite
		productid, price,qty,discountOnproduct
		customerName,address
		
		updateMenu(){}
		viewMenu(){}
		availableProds(){}
		addToTheCart(){}
		calculateEstimatedPricing(){}
		viewTheCart(){}
		deleteItemFromTheCart(){}
		orderIt(){}
		recieveThePayment(){}
		deliverIt(){}
		
	WristWatch
		cost,brand, display, color, lengthOfBelt
		type, ageGroup
		getTime(){}
		getDay(){}
		notify(){}
		claclSteps(){}
		setAlarm(){}
		checkHeartBeats(){}

 	 Sachin Tendulkar = 
 	 		object
 	 		
 	 		species, age, profession
 	 		family, desg/pos
 	 		rank, numberOfCenturies
 	 		numberOf50s
 	 		numberFourRuns
 	 		numberOfSixers
 	 		
 	 		move(){}
 	 		walk(){}
 	 		catch(){}
 	 		run(){}
 	 		eat(){}
 	 		hitSixer(){}
 	 		hitBoundry(){}
 	 		hitThreeRuns(){}
 	 		howIsThat(){}
 	 		
 	 		
 */